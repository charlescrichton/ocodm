//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.02.07 at 01:14:29 PM EST 
//


package org.cdisc.ns.odm.v130;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Comparator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Comparator"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="LT"/&gt;
 *     &lt;enumeration value="LE"/&gt;
 *     &lt;enumeration value="GT"/&gt;
 *     &lt;enumeration value="GE"/&gt;
 *     &lt;enumeration value="EQ"/&gt;
 *     &lt;enumeration value="NE"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="NOTIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Comparator")
@XmlEnum
public enum Comparator {

    LT,
    LE,
    GT,
    GE,
    EQ,
    NE,
    IN,
    NOTIN;

    public String value() {
        return name();
    }

    public static Comparator fromValue(String v) {
        return valueOf(v);
    }

}
