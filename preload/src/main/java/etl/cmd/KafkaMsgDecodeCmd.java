package etl.cmd;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.log4j.Logger;

import etl.engine.EngineUtil;
import etl.util.FieldType;

public class KafkaMsgDecodeCmd extends SchemaFileETLCmd{
	private static final long serialVersionUID = 1L;
	public static final Logger logger = Logger.getLogger(KafkaMsgDecodeCmd.class);
	public static final String cfgkey_entity_name="entity.name";
	private String entityName;
	private transient KafkaAdaptorCmd kac;
	private transient Consumer<String, String> consumer;
	
	public KafkaMsgDecodeCmd(String wfid, String staticCfg, String defaultFs, String[] otherArgs){
		init(wfid, staticCfg, defaultFs, otherArgs);
	}
	
	public void init(String wfid, String staticCfg, String defaultFs, String[] otherArgs){
		super.init(wfid, staticCfg, defaultFs, otherArgs);
		entityName = pc.getString(cfgkey_entity_name);
		kac = new KafkaAdaptorCmd(pc);
	}
	
	public Map<String, Object> decode(String v){
		List<FieldType> ftlist = logicSchema.getAttrTypes(entityName);
		List<String> attrList = logicSchema.getAttrNames(entityName);
		Map<String, Object> ret = new HashMap<String, Object>();
		String[] vs = v.split(",");
		for (int i=0; i<ftlist.size(); i++){
			FieldType ft = ftlist.get(i);
			String sv = vs[i];
			ret.put(attrList.get(i), ft.decode(sv));
		}
		return ret;
	}
	
	@Override
	public List<String> sgProcess() {
		super.init();
		if (consumer==null){
			consumer = EngineUtil.createConsumer(kac.getBootstrapServers(), new String[]{kac.getLogTopicName()});
		}
		Map<String, ConsumerRecords<String, String>> records = consumer.poll(100);
        for (String topic : records.keySet()){
        	ConsumerRecords<String, String> rs = records.get(topic);
        	for (ConsumerRecord<String, String> r: rs.records()){
        		try {
		            logger.info(String.format("offset = %d, key = %s, value = %s", r.offset(), r.key(), r.value()));
		            Map<String, Object> map = decode(r.value());
		            logger.info(String.format("map got:%s", map));
        		}catch(Exception e){
        			logger.error("", e);
        		}
        	}
        	logger.info(String.format("# records:%d", rs.records().size()));
        }
        
		return null;
	}
	
	@Override
	public void close(){
		logger.info("close consumer");
		if (consumer!=null){
			consumer.close();
		}
	}
}