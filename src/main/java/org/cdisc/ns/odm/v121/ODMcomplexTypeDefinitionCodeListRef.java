//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.18 at 11:54:46 AM EST 
//


package org.cdisc.ns.odm.v121;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ODMcomplexTypeDefinition-CodeListRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-CodeListRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}CodeListRefElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}CodeListRefAttributeExtension"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}CodeListRefAttributeDefinition"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-CodeListRef")
public class ODMcomplexTypeDefinitionCodeListRef {

    @XmlAttribute(name = "CodeListOID", required = true)
    protected String codeListOID;

    /**
     * Gets the value of the codeListOID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeListOID() {
        return codeListOID;
    }

    /**
     * Sets the value of the codeListOID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeListOID(String value) {
        this.codeListOID = value;
    }

}
