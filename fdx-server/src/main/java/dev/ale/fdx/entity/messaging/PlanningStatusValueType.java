//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.messaging;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlanningStatusValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PlanningStatusValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCUR"/>
 *     &lt;enumeration value="NON_CONCUR"/>
 *     &lt;enumeration value="NEGOTIATE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PlanningStatusValueType")
@XmlEnum
public enum PlanningStatusValueType {

    CONCUR,
    NON_CONCUR,
    NEGOTIATE;

    public String value() {
        return name();
    }

    public static PlanningStatusValueType fromValue(String v) {
        return valueOf(v);
    }

}
