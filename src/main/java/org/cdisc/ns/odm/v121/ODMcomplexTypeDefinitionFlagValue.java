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
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for ODMcomplexTypeDefinition-FlagValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-FlagValue">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.cdisc.org/ns/odm/v1.2>text">
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FlagValueAttributeDefinition"/>
 *       &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}FlagValueAttributeExtension"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-FlagValue", propOrder = {
    "value"
})
public class ODMcomplexTypeDefinitionFlagValue {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "CodeListOID", required = true)
    protected String codeListOID;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

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
