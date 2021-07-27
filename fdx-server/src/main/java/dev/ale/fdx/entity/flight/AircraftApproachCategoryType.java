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
 * <p>Java class for AircraftApproachCategoryType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AircraftApproachCategoryType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="H"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AircraftApproachCategoryType")
@XmlEnum
public enum AircraftApproachCategoryType {


    /**
     * 
     *                   less than 169 km/h (91 kt) indicated airspeed (IAS) [ICAO Doc 8168, Vol. I, chapter 
     *                   1.3.5] 
     *                
     * 
     */
    A,

    /**
     * 
     *                   169 km/h (91 kt) or more but less than 224 km/h (121 kt) IAS [ICAO Doc 8168, Vol. 
     *                   I, chapter 1.3.5] 
     *                
     * 
     */
    B,

    /**
     * 
     *                   224 km/h (121 kt) or more but less than 261 km/h (141 kt) IAS [ICAO Doc 8168, Vol. 
     *                   I, chapter 1.3.5] 
     *                
     * 
     */
    C,

    /**
     * 
     *                   261 km/h (141 kt) or more but less than 307 km/h (166 kt) IAS [ICAO Doc 8168, Vol. 
     *                   I, chapter 1.3.5] 
     *                
     * 
     */
    D,

    /**
     * 
     *                   307 km/h (166 kt) or more but less than 391 km/h (211 kt) IAS [ICAO Doc 8168, Vol. 
     *                   I, chapter 1.3.5] 
     *                
     * 
     */
    E,

    /**
     * 
     *                   Helicopters [ICAO Doc 8168, Vol. I, chapter 1.3.5] 
     *                
     * 
     */
    H;

    public String value() {
        return name();
    }

    public static AircraftApproachCategoryType fromValue(String v) {
        return valueOf(v);
    }

}
