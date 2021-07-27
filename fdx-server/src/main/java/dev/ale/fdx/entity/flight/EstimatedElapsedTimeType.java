//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;

import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.DurationAsString;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import dev.ale.fdx.entity.base.ExtensibleType;


/**
 * 
 *             The estimated amount of time from takeoff to reach a significant point or Flight 
 *             Information Region (FIR) boundary along the route of flight. 
 *          
 * 
 * <p>Java class for EstimatedElapsedTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EstimatedElapsedTimeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="location" type="{http://www.fixm.aero/flight/4.1}ElapsedTimeLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="elapsedTime" type="{http://www.fixm.aero/base/4.1}DurationType" />
 *       &lt;attribute name="seqNum">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *             &lt;minInclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstimatedElapsedTimeType", propOrder = {
    "location"
})
@Entity(name = "EstimatedElapsedTimeType")
@Table(name = "ESTIMATEDELAPSEDTIMETYPE")
public class EstimatedElapsedTimeType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected ElapsedTimeLocationType location;
    @XmlAttribute(name = "elapsedTime")
    protected Duration elapsedTime;
    @XmlAttribute(name = "seqNum")
    protected Integer seqNum;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ElapsedTimeLocationType }
     *     
     */
    @ManyToOne(targetEntity = ElapsedTimeLocationType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "LOCATION__ESTIMATEDELAPSEDTI_0")
    public ElapsedTimeLocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElapsedTimeLocationType }
     *     
     */
    public void setLocation(ElapsedTimeLocationType value) {
        this.location = value;
    }

    /**
     * Gets the value of the elapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    @Transient
    public Duration getElapsedTime() {
        return elapsedTime;
    }

    /**
     * Sets the value of the elapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setElapsedTime(Duration value) {
        this.elapsedTime = value;
    }

    /**
     * Gets the value of the seqNum property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "SEQNUM", scale = 0)
    public Integer getSeqNum() {
        return seqNum;
    }

    /**
     * Sets the value of the seqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNum(Integer value) {
        this.seqNum = value;
    }

    @Basic
    @Column(name = "ELAPSEDTIMEITEM", length = 127)
    public String getElapsedTimeItem() {
        return XmlAdapterUtils.unmarshall(DurationAsString.class, this.getElapsedTime());
    }

    public void setElapsedTimeItem(String target) {
        setElapsedTime(XmlAdapterUtils.marshall(DurationAsString.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EstimatedElapsedTimeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EstimatedElapsedTimeType that = ((EstimatedElapsedTimeType) object);
        {
            ElapsedTimeLocationType lhsLocation;
            lhsLocation = this.getLocation();
            ElapsedTimeLocationType rhsLocation;
            rhsLocation = that.getLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "location", lhsLocation), LocatorUtils.property(thatLocator, "location", rhsLocation), lhsLocation, rhsLocation)) {
                return false;
            }
        }
        {
            Duration lhsElapsedTime;
            lhsElapsedTime = this.getElapsedTime();
            Duration rhsElapsedTime;
            rhsElapsedTime = that.getElapsedTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "elapsedTime", lhsElapsedTime), LocatorUtils.property(thatLocator, "elapsedTime", rhsElapsedTime), lhsElapsedTime, rhsElapsedTime)) {
                return false;
            }
        }
        {
            Integer lhsSeqNum;
            lhsSeqNum = this.getSeqNum();
            Integer rhsSeqNum;
            rhsSeqNum = that.getSeqNum();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seqNum", lhsSeqNum), LocatorUtils.property(thatLocator, "seqNum", rhsSeqNum), lhsSeqNum, rhsSeqNum)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            ElapsedTimeLocationType theLocation;
            theLocation = this.getLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "location", theLocation), currentHashCode, theLocation);
        }
        {
            Duration theElapsedTime;
            theElapsedTime = this.getElapsedTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "elapsedTime", theElapsedTime), currentHashCode, theElapsedTime);
        }
        {
            Integer theSeqNum;
            theSeqNum = this.getSeqNum();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seqNum", theSeqNum), currentHashCode, theSeqNum);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}