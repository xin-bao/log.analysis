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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PREPARE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PREPARE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="delete" type="{uri:oozie:workflow:0.5}DELETE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mkdir" type="{uri:oozie:workflow:0.5}MKDIR" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PREPARE", propOrder = {
    "delete",
    "mkdir"
})
public class PREPARE {

    protected List<DELETE> delete;
    protected List<MKDIR> mkdir;

    /**
     * Gets the value of the delete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the delete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDelete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELETE }
     * 
     * 
     */
    public List<DELETE> getDelete() {
        if (delete == null) {
            delete = new ArrayList<DELETE>();
        }
        return this.delete;
    }

    /**
     * Gets the value of the mkdir property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mkdir property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMkdir().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MKDIR }
     * 
     * 
     */
    public List<MKDIR> getMkdir() {
        if (mkdir == null) {
            mkdir = new ArrayList<MKDIR>();
        }
        return this.mkdir;
    }

}
