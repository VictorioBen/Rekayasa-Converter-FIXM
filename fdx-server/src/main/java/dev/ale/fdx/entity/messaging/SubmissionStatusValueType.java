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
 * <p>Java class for SubmissionStatusValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubmissionStatusValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACK"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="MANUAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubmissionStatusValueType")
@XmlEnum
public enum SubmissionStatusValueType {


    /**
     * 
     *                   A submission status of "Ack" shall indicate that a message could be processed and 
     *                   acted on. [ICAO Draft FF-ICE Implementation Guidance] 
     *                
     * 
     */
    ACK,

    /**
     * 
     *                   A submission status of "Reject" shall indicate that a message could not be processed 
     *                   and acted on, and was not retained by the receiving system. [ICAO Draft FF-ICE Implementation 
     *                   Guidance] 
     *                
     * 
     */
    REJECT,

    /**
     * 
     *                   A submission status of "Manual" shall indicate that a message could not be processed 
     *                   and acted on, and the receiving unit is attempting manual handling of the message. 
     *                   [ICAO Draft FF-ICE Implementation Guidance] 
     *                
     * 
     */
    MANUAL;

    public String value() {
        return name();
    }

    public static SubmissionStatusValueType fromValue(String v) {
        return valueOf(v);
    }

}
