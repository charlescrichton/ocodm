//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.11.18 at 11:54:46 AM EST 
//


package org.cdisc.ns.odm.v121;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.openclinica.ns.odm_ext_v121.v31.OCodmComplexTypeDefinitionMultiSelectListRef;


/**
 * <p>Java class for ODMcomplexTypeDefinition-ItemDef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ODMcomplexTypeDefinition-ItemDef">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.cdisc.org/ns/odm/v1.2}ODMcomplexTypeDefinition-ItemDef">
 *       &lt;redefine>
 *         &lt;complexType name="ODMcomplexTypeDefinition-ItemDef">
 *           &lt;complexContent>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *               &lt;sequence>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Question" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}ExternalQuestion" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}MeasurementUnitRef" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}RangeCheck" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}CodeListRef" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Role" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;element ref="{http://www.cdisc.org/ns/odm/v1.2}Alias" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;group ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDefElementExtension" maxOccurs="unbounded" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDefAttributeDefinition"/>
 *               &lt;attGroup ref="{http://www.cdisc.org/ns/odm/v1.2}ItemDefAttributeExtension"/>
 *             &lt;/restriction>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;sequence>
 *         &lt;element ref="{http://www.openclinica.org/ns/odm_ext_v121/v3.1}MultiSelectListRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ODMcomplexTypeDefinition-ItemDef", propOrder = {
    "multiSelectListRef"
})
public class ODMcomplexTypeDefinitionItemDef
    extends OriginalODMcomplexTypeDefinitionItemDef
{

    @XmlElement(name = "MultiSelectListRef", namespace = "http://www.openclinica.org/ns/odm_ext_v121/v3.1")
    protected List<OCodmComplexTypeDefinitionMultiSelectListRef> multiSelectListRef;

    /**
     * Gets the value of the multiSelectListRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiSelectListRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiSelectListRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OCodmComplexTypeDefinitionMultiSelectListRef }
     * 
     * 
     */
    public List<OCodmComplexTypeDefinitionMultiSelectListRef> getMultiSelectListRef() {
        if (multiSelectListRef == null) {
            multiSelectListRef = new ArrayList<OCodmComplexTypeDefinitionMultiSelectListRef>();
        }
        return this.multiSelectListRef;
    }

}
