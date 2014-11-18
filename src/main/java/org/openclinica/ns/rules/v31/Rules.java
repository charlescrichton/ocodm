//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.18 at 11:54:46 AM EST 
//


package org.openclinica.ns.rules.v31;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}RuleAssignment" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.openclinica.org/ns/rules/v3.1}RuleDef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ruleAssignment",
    "ruleDef"
})
@XmlRootElement(name = "Rules")
public class Rules {

    @XmlElement(name = "RuleAssignment", required = true)
    protected List<RuleAssignmentType> ruleAssignment;
    @XmlElement(name = "RuleDef")
    protected List<RuleDefType> ruleDef;

    /**
     * Gets the value of the ruleAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleAssignmentType }
     * 
     * 
     */
    public List<RuleAssignmentType> getRuleAssignment() {
        if (ruleAssignment == null) {
            ruleAssignment = new ArrayList<RuleAssignmentType>();
        }
        return this.ruleAssignment;
    }

    /**
     * Gets the value of the ruleDef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleDef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleDef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleDefType }
     * 
     * 
     */
    public List<RuleDefType> getRuleDef() {
        if (ruleDef == null) {
            ruleDef = new ArrayList<RuleDefType>();
        }
        return this.ruleDef;
    }

}
