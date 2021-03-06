//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatalinkCommunicationCapabilityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DatalinkCommunicationCapabilityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="J1"/>
 *     &lt;enumeration value="J2"/>
 *     &lt;enumeration value="J3"/>
 *     &lt;enumeration value="J4"/>
 *     &lt;enumeration value="J5"/>
 *     &lt;enumeration value="J6"/>
 *     &lt;enumeration value="J7"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DatalinkCommunicationCapabilityCodeType")
@XmlEnum
public enum DatalinkCommunicationCapabilityCodeType {


    /**
     * 
     *                   CPDLC ATN VDL Mode 2 
     *                
     * 
     */
    @XmlEnumValue("J1")
    J_1("J1"),

    /**
     * 
     *                   CPDLC FANS 1/A HFDL 
     *                
     * 
     */
    @XmlEnumValue("J2")
    J_2("J2"),

    /**
     * 
     *                   CPDLC FANS 1/A VDL Mode A 
     *                
     * 
     */
    @XmlEnumValue("J3")
    J_3("J3"),

    /**
     * 
     *                   CPDLC FANS 1/A VDL Mode 2 
     *                
     * 
     */
    @XmlEnumValue("J4")
    J_4("J4"),

    /**
     * 
     *                   CPDLC FANS 1/A SATCOM (INMARSAT) 
     *                
     * 
     */
    @XmlEnumValue("J5")
    J_5("J5"),

    /**
     * 
     *                   CPDLC FANS 1/A SATCOM (MTSAT) 
     *                
     * 
     */
    @XmlEnumValue("J6")
    J_6("J6"),

    /**
     * 
     *                   CPDLC FANS 1/A SATCOM (MTSAT) 
     *                
     * 
     */
    @XmlEnumValue("J7")
    J_7("J7");
    private final String value;

    DatalinkCommunicationCapabilityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DatalinkCommunicationCapabilityCodeType fromValue(String v) {
        for (DatalinkCommunicationCapabilityCodeType c: DatalinkCommunicationCapabilityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
