//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ZeroBearingTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ZeroBearingTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TRUE_NORTH"/>
 *     &lt;enumeration value="MAGNETIC_NORTH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ZeroBearingTypeType")
@XmlEnum
public enum ZeroBearingTypeType {


    /**
     * 
     *                   This value indicates that the direction is relative to True North. 
     *                
     * 
     */
    TRUE_NORTH,

    /**
     * 
     *                   This value indicates that the direction is relative to Magnetic North. 
     *                
     * 
     */
    MAGNETIC_NORTH;

    public String value() {
        return name();
    }

    public static ZeroBearingTypeType fromValue(String v) {
        return valueOf(v);
    }

}
