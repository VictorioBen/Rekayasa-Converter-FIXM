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
 * <p>Java class for EmergencyRadioCapabilityTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmergencyRadioCapabilityTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ULTRA_HIGH_FREQUENCY"/>
 *     &lt;enumeration value="VERY_HIGH_FREQUENCY"/>
 *     &lt;enumeration value="EMERGENCY_LOCATOR_TRANSMITTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmergencyRadioCapabilityTypeType")
@XmlEnum
public enum EmergencyRadioCapabilityTypeType {


    /**
     * 
     *                   UHF on frequency 243.0 MHz is available [adapted from ICAO Doc 4444, Appendix 2, 
     *                   ITEM 19 R/] 
     *                
     * 
     */
    ULTRA_HIGH_FREQUENCY,

    /**
     * 
     *                   VHF on frequency 121.5 MHz is available [adapted from ICAO Doc 4444, Appendix 2, 
     *                   ITEM 19 R/] 
     *                
     * 
     */
    VERY_HIGH_FREQUENCY,

    /**
     * 
     *                   emergency locator transmitter (ELT) not available [adapted from ICAO Doc 4444, Appendix 
     *                   2, ITEM 19 R/] 
     *                
     * 
     */
    EMERGENCY_LOCATOR_TRANSMITTER;

    public String value() {
        return name();
    }

    public static EmergencyRadioCapabilityTypeType fromValue(String v) {
        return valueOf(v);
    }

}