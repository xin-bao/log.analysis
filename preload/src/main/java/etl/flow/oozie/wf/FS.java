//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.03 at 12:23:46 PM PDT 
//


package etl.flow.oozie.wf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name-node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="job-xml" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="configuration" type="{uri:oozie:workflow:0.5}CONFIGURATION" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="delete" type="{uri:oozie:workflow:0.5}DELETE"/>
 *           &lt;element name="mkdir" type="{uri:oozie:workflow:0.5}MKDIR"/>
 *           &lt;element name="move" type="{uri:oozie:workflow:0.5}MOVE"/>
 *           &lt;element name="chmod" type="{uri:oozie:workflow:0.5}CHMOD"/>
 *           &lt;element name="touchz" type="{uri:oozie:workflow:0.5}TOUCHZ"/>
 *           &lt;element name="chgrp" type="{uri:oozie:workflow:0.5}CHGRP"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FS", propOrder = {
    "nameNode",
    "jobXml",
    "configuration",
    "deleteOrMkdirOrMove"
})
public class FS {

    @XmlElement(name = "name-node")
    protected String nameNode;
    @XmlElement(name = "job-xml")
    protected List<String> jobXml;
    protected CONFIGURATION configuration;
    @XmlElements({
        @XmlElement(name = "delete", type = DELETE.class),
        @XmlElement(name = "mkdir", type = MKDIR.class),
        @XmlElement(name = "move", type = MOVE.class),
        @XmlElement(name = "chmod", type = CHMOD.class),
        @XmlElement(name = "touchz", type = TOUCHZ.class),
        @XmlElement(name = "chgrp", type = CHGRP.class)
    })
    protected List<Object> deleteOrMkdirOrMove;

    /**
     * Gets the value of the nameNode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameNode() {
        return nameNode;
    }

    /**
     * Sets the value of the nameNode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameNode(String value) {
        this.nameNode = value;
    }

    /**
     * Gets the value of the jobXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJobXml() {
        if (jobXml == null) {
            jobXml = new ArrayList<String>();
        }
        return this.jobXml;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link CONFIGURATION }
     *     
     */
    public CONFIGURATION getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link CONFIGURATION }
     *     
     */
    public void setConfiguration(CONFIGURATION value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the deleteOrMkdirOrMove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteOrMkdirOrMove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteOrMkdirOrMove().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELETE }
     * {@link MKDIR }
     * {@link MOVE }
     * {@link CHMOD }
     * {@link TOUCHZ }
     * {@link CHGRP }
     * 
     * 
     */
    public List<Object> getDeleteOrMkdirOrMove() {
        if (deleteOrMkdirOrMove == null) {
            deleteOrMkdirOrMove = new ArrayList<Object>();
        }
        return this.deleteOrMkdirOrMove;
    }

}
