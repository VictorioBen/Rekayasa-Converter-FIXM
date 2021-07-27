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
 * <p>Java class for TrajectoryPointPropertyTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrajectoryPointPropertyTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TOP_OF_CLIMB"/>
 *     &lt;enumeration value="TOP_OF_DESCENT"/>
 *     &lt;enumeration value="CROSSOVER_ALTITUDE"/>
 *     &lt;enumeration value="TRANSITION_ALTITUDE_OR_LEVEL"/>
 *     &lt;enumeration value="TCP_ALTITUDE"/>
 *     &lt;enumeration value="TCP_SPEED"/>
 *     &lt;enumeration value="TCP_LATERAL"/>
 *     &lt;enumeration value="DEPARTURE_RUNWAY_END"/>
 *     &lt;enumeration value="START_TAKEOFF_ROLL"/>
 *     &lt;enumeration value="END_LANDING_ROLL"/>
 *     &lt;enumeration value="WHEELS_OFF"/>
 *     &lt;enumeration value="WHEELS_ON"/>
 *     &lt;enumeration value="ENTRY_RESTRICTED_OR_RESERVED_AIRSPACE"/>
 *     &lt;enumeration value="EXIT_RESTRICTED_OR_RESERVED_AIRSPACE"/>
 *     &lt;enumeration value="CROSSING_CONSTRAINED_AIRSPACE"/>
 *     &lt;enumeration value="EXIT_CONSTRAINED_AIRSPACE"/>
 *     &lt;enumeration value="INITIAL_PREDICTION_POINT"/>
 *     &lt;enumeration value="END_PREDICTION_POINT"/>
 *     &lt;enumeration value="HOLD_ENTRY"/>
 *     &lt;enumeration value="HOLD_EXIT"/>
 *     &lt;enumeration value="BEGIN_STAY"/>
 *     &lt;enumeration value="END_STAY"/>
 *     &lt;enumeration value="START_EXPECT_VECTORS"/>
 *     &lt;enumeration value="END_EXPECT_VECTORS"/>
 *     &lt;enumeration value="CONSTRAINT_POINT"/>
 *     &lt;enumeration value="FIR_BOUNDARY_CROSSING_POINT"/>
 *     &lt;enumeration value="RUNWAY_THRESHOLD"/>
 *     &lt;enumeration value="PRESCRIBED_EET_POINT"/>
 *     &lt;enumeration value="ENTRY_CONSTRAINED_AIRSPACE"/>
 *     &lt;enumeration value="AIRPORT_REFERENCE_LOCATION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrajectoryPointPropertyTypeType")
@XmlEnum
public enum TrajectoryPointPropertyTypeType {

    TOP_OF_CLIMB,
    TOP_OF_DESCENT,
    CROSSOVER_ALTITUDE,
    TRANSITION_ALTITUDE_OR_LEVEL,
    TCP_ALTITUDE,
    TCP_SPEED,
    TCP_LATERAL,
    DEPARTURE_RUNWAY_END,
    START_TAKEOFF_ROLL,
    END_LANDING_ROLL,
    WHEELS_OFF,
    WHEELS_ON,
    ENTRY_RESTRICTED_OR_RESERVED_AIRSPACE,
    EXIT_RESTRICTED_OR_RESERVED_AIRSPACE,
    CROSSING_CONSTRAINED_AIRSPACE,
    EXIT_CONSTRAINED_AIRSPACE,
    INITIAL_PREDICTION_POINT,
    END_PREDICTION_POINT,
    HOLD_ENTRY,
    HOLD_EXIT,
    BEGIN_STAY,
    END_STAY,
    START_EXPECT_VECTORS,
    END_EXPECT_VECTORS,
    CONSTRAINT_POINT,
    FIR_BOUNDARY_CROSSING_POINT,
    RUNWAY_THRESHOLD,
    PRESCRIBED_EET_POINT,
    ENTRY_CONSTRAINED_AIRSPACE,
    AIRPORT_REFERENCE_LOCATION;

    public String value() {
        return name();
    }

    public static TrajectoryPointPropertyTypeType fromValue(String v) {
        return valueOf(v);
    }

}