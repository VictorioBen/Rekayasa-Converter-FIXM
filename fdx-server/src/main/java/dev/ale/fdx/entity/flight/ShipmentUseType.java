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
 * <p>Java class for ShipmentUseType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShipmentUseType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EXCLUSIVE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShipmentUseType")
@XmlEnum
public enum ShipmentUseType {


    /**
     * 
     *                   Indicates of sole use, by a single shipper, of an aircraft or of a large freight 
     *                   container, of which all initial, intermediate and final loading and unloading is 
     *                   carried out in accordance with the directions of the shipper or consignee. 
     *                
     * 
     */
    EXCLUSIVE;

    public String value() {
        return name();
    }

    public static ShipmentUseType fromValue(String v) {
        return valueOf(v);
    }

}
