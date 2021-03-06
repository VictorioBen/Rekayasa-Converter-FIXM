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
 * <p>Java class for PerformanceBasedNavigationCapabilityCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PerformanceBasedNavigationCapabilityCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A1"/>
 *     &lt;enumeration value="B1"/>
 *     &lt;enumeration value="B2"/>
 *     &lt;enumeration value="B3"/>
 *     &lt;enumeration value="B4"/>
 *     &lt;enumeration value="B5"/>
 *     &lt;enumeration value="B6"/>
 *     &lt;enumeration value="C1"/>
 *     &lt;enumeration value="C2"/>
 *     &lt;enumeration value="C3"/>
 *     &lt;enumeration value="C4"/>
 *     &lt;enumeration value="D1"/>
 *     &lt;enumeration value="D2"/>
 *     &lt;enumeration value="D3"/>
 *     &lt;enumeration value="D4"/>
 *     &lt;enumeration value="L1"/>
 *     &lt;enumeration value="O1"/>
 *     &lt;enumeration value="O2"/>
 *     &lt;enumeration value="O3"/>
 *     &lt;enumeration value="O4"/>
 *     &lt;enumeration value="S1"/>
 *     &lt;enumeration value="S2"/>
 *     &lt;enumeration value="T1"/>
 *     &lt;enumeration value="T2"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PerformanceBasedNavigationCapabilityCodeType")
@XmlEnum
public enum PerformanceBasedNavigationCapabilityCodeType {


    /**
     * 
     *                   RNAV 10 (RNP 10) 
     *                
     * 
     */
    @XmlEnumValue("A1")
    A_1("A1"),

    /**
     * 
     *                   RNAV 5 All Permitted Sensors 
     *                
     * 
     */
    @XmlEnumValue("B1")
    B_1("B1"),

    /**
     * 
     *                   RNAV 5 GNSS 
     *                
     * 
     */
    @XmlEnumValue("B2")
    B_2("B2"),

    /**
     * 
     *                   RNAV 5 DME/DME 
     *                
     * 
     */
    @XmlEnumValue("B3")
    B_3("B3"),

    /**
     * 
     *                   RNAV 5 VOR/DME 
     *                
     * 
     */
    @XmlEnumValue("B4")
    B_4("B4"),

    /**
     * 
     *                   RNAV 5 INS or IRS 
     *                
     * 
     */
    @XmlEnumValue("B5")
    B_5("B5"),

    /**
     * 
     *                   RNAV 5 LORAN-C 
     *                
     * 
     */
    @XmlEnumValue("B6")
    B_6("B6"),

    /**
     * 
     *                   RNAV 2 All Permitted Sensors 
     *                
     * 
     */
    @XmlEnumValue("C1")
    C_1("C1"),

    /**
     * 
     *                   RNAV 2 GNSS 
     *                
     * 
     */
    @XmlEnumValue("C2")
    C_2("C2"),

    /**
     * 
     *                   RNAV 2 DME/DME 
     *                
     * 
     */
    @XmlEnumValue("C3")
    C_3("C3"),

    /**
     * 
     *                   RNAV 2 DME/DME/IRU 
     *                
     * 
     */
    @XmlEnumValue("C4")
    C_4("C4"),

    /**
     * 
     *                   RNAV 1 All Permitted Sensors 
     *                
     * 
     */
    @XmlEnumValue("D1")
    D_1("D1"),

    /**
     * 
     *                   RNAV 1 GNSS 
     *                
     * 
     */
    @XmlEnumValue("D2")
    D_2("D2"),

    /**
     * 
     *                   RNAV 1 DME/DME 
     *                
     * 
     */
    @XmlEnumValue("D3")
    D_3("D3"),

    /**
     * 
     *                   RNAV 1 DME/DME/IRU 
     *                
     * 
     */
    @XmlEnumValue("D4")
    D_4("D4"),

    /**
     * 
     *                   RNP 4 
     *                
     * 
     */
    @XmlEnumValue("L1")
    L_1("L1"),

    /**
     * 
     *                   Basic RNP 1 All Permitted Sensors 
     *                
     * 
     */
    @XmlEnumValue("O1")
    O_1("O1"),

    /**
     * 
     *                   Basic RNP 1 GNSS 
     *                
     * 
     */
    @XmlEnumValue("O2")
    O_2("O2"),

    /**
     * 
     *                   Basic RNP 1 DME/DME 
     *                
     * 
     */
    @XmlEnumValue("O3")
    O_3("O3"),

    /**
     * 
     *                   Basic RNP 1 DME/DME/IRU 
     *                
     * 
     */
    @XmlEnumValue("O4")
    O_4("O4"),

    /**
     * 
     *                   RNP APCH 
     *                
     * 
     */
    @XmlEnumValue("S1")
    S_1("S1"),

    /**
     * 
     *                   RNP APCH with Barometric Vertical Navigation 
     *                
     * 
     */
    @XmlEnumValue("S2")
    S_2("S2"),

    /**
     * 
     *                   RNP AR APCH with RF (Authorization Required) 
     *                
     * 
     */
    @XmlEnumValue("T1")
    T_1("T1"),

    /**
     * 
     *                   RNP AR APCH without RF (Authorization Required) 
     *                
     * 
     */
    @XmlEnumValue("T2")
    T_2("T2");
    private final String value;

    PerformanceBasedNavigationCapabilityCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PerformanceBasedNavigationCapabilityCodeType fromValue(String v) {
        for (PerformanceBasedNavigationCapabilityCodeType c: PerformanceBasedNavigationCapabilityCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
