package etl.telecom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

public class NanpaCode {
	public static final Logger logger = Logger.getLogger(NanpaCode.class);
	private static final String nanpa_file ="allutlzd.txt";
	private static Set<String> ccSet = new HashSet<String>();
	
	public NanpaCode(){
		init(nanpa_file);
	}
	
	public void init(String fileName){
		BufferedReader br=null;
		String line;
		try {
			br = new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(fileName)));
			while ((line = br.readLine()) != null) {
			    String[] vals = line.split("\t");
			    ccSet.add(vals[1]);
			}
		}catch (Exception e){
			logger.error("", e);
		}finally{
			try {
				br.close();
			}catch(Exception e){
				logger.error("", e);
			}
		}
	}
	
	public boolean hasNanpa(String code){
		return ccSet.contains(code);
	}
}
