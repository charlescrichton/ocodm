//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.07 at 01:14:29 PM EST 
//


package org.openclinica.ns.odm_ext_v130.v31;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCodmComplexTypeDefinition-SimpleConditionalDisplay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCodmComplexTypeDefinition-SimpleConditionalDisplay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ControlItemName" type="{http://www.cdisc.org/ns/odm/v1.3}text"/&gt;
 *         &lt;element name="OptionValue" type="{http://www.cdisc.org/ns/odm/v1.3}text"/&gt;
 *         &lt;element name="Message" type="{http://www.cdisc.org/ns/odm/v1.3}text"/&gt;
 *         &lt;group ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SimpleConditionalDisplayElementExtension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SimpleConditionalDisplayAttributeExtension"/&gt;
 *       &lt;attGroup ref="{http://www.openclinica.org/ns/odm_ext_v130/v3.1}SimpleConditionalDisplayAttributeDefinition"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCodmComplexTypeDefinition-SimpleConditionalDisplay", propOrder = {
    "controlItemName",
    "optionValue",
    "message"
})
public class OCodmComplexTypeDefinitionSimpleConditionalDisplay {

    @XmlElement(name = "ControlItemName", required = true)
    protected String controlItemName;
    @XmlElement(name = "OptionValue", required = true)
    protected String optionValue;
    @XmlElement(name = "Message", required = true)
    protected String message;

    /**
     * Gets the value of the controlItemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlItemName() {
        return controlItemName;
    }

    /**
     * Sets the value of the controlItemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlItemName(String value) {
        this.controlItemName = value;
    }

    /**
     * Gets the value of the optionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionValue() {
        return optionValue;
    }

    /**
     * Sets the value of the optionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionValue(String value) {
        this.optionValue = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
