//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AT"/>
 *     &lt;enumeration value="AT_OR_BEFORE"/>
 *     &lt;enumeration value="AT_OR_AFTER"/>
 *     &lt;enumeration value="BETWEEN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeConditionType")
@XmlEnum
public enum TimeConditionType {

    AT,
    AT_OR_BEFORE,
    AT_OR_AFTER,
    BETWEEN;

    public String value() {
        return name();
    }

    public static TimeConditionType fromValue(String v) {
        return valueOf(v);
    }

}
