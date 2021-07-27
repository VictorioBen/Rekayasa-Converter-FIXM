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
 * <p>Java class for MaterialDispersabilityType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaterialDispersabilityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="LOW_DISPERSIBLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaterialDispersabilityType")
@XmlEnum
public enum MaterialDispersabilityType {


    /**
     * 
     *                   Indicates that the dangerous good is either (1) a low dispersible radioactive material, 
     *                   (2) a solid radioactive material, or (3) a solid radioactive material in a sealed 
     *                   capsule which has limited dispersibility and is not in powder form. 
     *                
     * 
     */
    LOW_DISPERSIBLE;

    public String value() {
        return name();
    }

    public static MaterialDispersabilityType fromValue(String v) {
        return valueOf(v);
    }

}