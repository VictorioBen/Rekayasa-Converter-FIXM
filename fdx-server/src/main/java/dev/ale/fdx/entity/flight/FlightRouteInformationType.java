//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.DurationAsString;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XMLGregorianCalendarAsDateTime;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.springframework.context.annotation.Lazy;

import dev.ale.fdx.entity.base.ExtensibleType;
import dev.ale.fdx.entity.base.FlightLevelOrAltitudeType;
import dev.ale.fdx.entity.base.TrueAirspeedType;


/**
 * 
 *             Contains basic information about the Flight Route that pertains to the whole flight. 
 *             
 *          
 * 
 * <p>Java class for FlightRouteInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightRouteInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="cruisingLevel" type="{http://www.fixm.aero/base/4.1}FlightLevelOrAltitudeType" minOccurs="0"/>
 *         &lt;element name="cruisingSpeed" type="{http://www.fixm.aero/base/4.1}TrueAirspeedType" minOccurs="0"/>
 *         &lt;element name="estimatedElapsedTime" type="{http://www.fixm.aero/flight/4.1}EstimatedElapsedTimeType" maxOccurs="2000" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="airfileRouteStartTime" type="{http://www.fixm.aero/base/4.1}TimeType" />
 *       &lt;attribute name="flightRulesCategory" type="{http://www.fixm.aero/flight/4.1}FlightRulesCategoryType" />
 *       &lt;attribute name="routeText" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *       &lt;attribute name="totalEstimatedElapsedTime" type="{http://www.fixm.aero/base/4.1}DurationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRouteInformationType", propOrder = {
    "cruisingLevel",
    "cruisingSpeed",
    "estimatedElapsedTime"
})
@Entity(name = "FlightRouteInformationType")
@Table(name = "FLIGHTROUTEINFORMATIONTYPE")
public class FlightRouteInformationType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected FlightLevelOrAltitudeType cruisingLevel;
    protected TrueAirspeedType cruisingSpeed;
    protected List<EstimatedElapsedTimeType> estimatedElapsedTime;
    @XmlAttribute(name = "airfileRouteStartTime")
    protected XMLGregorianCalendar airfileRouteStartTime;
    @XmlAttribute(name = "flightRulesCategory")
    protected FlightRulesCategoryType flightRulesCategory;
    @XmlAttribute(name = "routeText")
    protected String routeText;
    @XmlAttribute(name = "totalEstimatedElapsedTime")
    protected Duration totalEstimatedElapsedTime;

    /**
     * Gets the value of the cruisingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link FlightLevelOrAltitudeType }
     *     
     */
    @ManyToOne(targetEntity = FlightLevelOrAltitudeType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CRUISINGLEVEL_FLIGHTROUTEINF_0")
    public FlightLevelOrAltitudeType getCruisingLevel() {
        return cruisingLevel;
    }

    /**
     * Sets the value of the cruisingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightLevelOrAltitudeType }
     *     
     */
    public void setCruisingLevel(FlightLevelOrAltitudeType value) {
        this.cruisingLevel = value;
    }

    /**
     * Gets the value of the cruisingSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link TrueAirspeedType }
     *     
     */
    @ManyToOne(targetEntity = TrueAirspeedType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CRUISINGSPEED_FLIGHTROUTEINF_0")
    public TrueAirspeedType getCruisingSpeed() {
        return cruisingSpeed;
    }

    /**
     * Sets the value of the cruisingSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueAirspeedType }
     *     
     */
    public void setCruisingSpeed(TrueAirspeedType value) {
        this.cruisingSpeed = value;
    }

    /**
     * Gets the value of the estimatedElapsedTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedElapsedTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedElapsedTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstimatedElapsedTimeType }
     * 
     * 
     */
    @OneToMany(targetEntity = EstimatedElapsedTimeType.class, cascade = {
        CascadeType.ALL
    },fetch = FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "ESTIMATEDELAPSEDTIME_FLIGHTR_0")
    public List<EstimatedElapsedTimeType> getEstimatedElapsedTime() {
        if (estimatedElapsedTime == null) {
            estimatedElapsedTime = new ArrayList<EstimatedElapsedTimeType>();
        }
        return this.estimatedElapsedTime;
    }

    /**
     * 
     * 
     */
    public void setEstimatedElapsedTime(List<EstimatedElapsedTimeType> estimatedElapsedTime) {
        this.estimatedElapsedTime = estimatedElapsedTime;
    }

    /**
     * Gets the value of the airfileRouteStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getAirfileRouteStartTime() {
        return airfileRouteStartTime;
    }

    /**
     * Sets the value of the airfileRouteStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAirfileRouteStartTime(XMLGregorianCalendar value) {
        this.airfileRouteStartTime = value;
    }

    /**
     * Gets the value of the flightRulesCategory property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRulesCategoryType }
     *     
     */
    @Basic
    @Column(name = "FLIGHTRULESCATEGORY", length = 255)
    @Enumerated(EnumType.STRING)
    public FlightRulesCategoryType getFlightRulesCategory() {
        return flightRulesCategory;
    }

    /**
     * Sets the value of the flightRulesCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRulesCategoryType }
     *     
     */
    public void setFlightRulesCategory(FlightRulesCategoryType value) {
        this.flightRulesCategory = value;
    }

    /**
     * Gets the value of the routeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ROUTETEXT", length = 4096)
    public String getRouteText() {
        return routeText;
    }

    /**
     * Sets the value of the routeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteText(String value) {
        this.routeText = value;
    }

    /**
     * Gets the value of the totalEstimatedElapsedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    @Transient
    public Duration getTotalEstimatedElapsedTime() {
        return totalEstimatedElapsedTime;
    }

    /**
     * Sets the value of the totalEstimatedElapsedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalEstimatedElapsedTime(Duration value) {
        this.totalEstimatedElapsedTime = value;
    }

    @Basic
    @Column(name = "AIRFILEROUTESTARTTIMEITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getAirfileRouteStartTimeItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getAirfileRouteStartTime());
    }

    public void setAirfileRouteStartTimeItem(Date target) {
        setAirfileRouteStartTime(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    @Basic
    @Column(name = "TOTALESTIMATEDELAPSEDTIMEITEM", length = 127)
    public String getTotalEstimatedElapsedTimeItem() {
        return XmlAdapterUtils.unmarshall(DurationAsString.class, this.getTotalEstimatedElapsedTime());
    }

    public void setTotalEstimatedElapsedTimeItem(String target) {
        setTotalEstimatedElapsedTime(XmlAdapterUtils.marshall(DurationAsString.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FlightRouteInformationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FlightRouteInformationType that = ((FlightRouteInformationType) object);
        {
            FlightLevelOrAltitudeType lhsCruisingLevel;
            lhsCruisingLevel = this.getCruisingLevel();
            FlightLevelOrAltitudeType rhsCruisingLevel;
            rhsCruisingLevel = that.getCruisingLevel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cruisingLevel", lhsCruisingLevel), LocatorUtils.property(thatLocator, "cruisingLevel", rhsCruisingLevel), lhsCruisingLevel, rhsCruisingLevel)) {
                return false;
            }
        }
        {
            TrueAirspeedType lhsCruisingSpeed;
            lhsCruisingSpeed = this.getCruisingSpeed();
            TrueAirspeedType rhsCruisingSpeed;
            rhsCruisingSpeed = that.getCruisingSpeed();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cruisingSpeed", lhsCruisingSpeed), LocatorUtils.property(thatLocator, "cruisingSpeed", rhsCruisingSpeed), lhsCruisingSpeed, rhsCruisingSpeed)) {
                return false;
            }
        }
        {
            List<EstimatedElapsedTimeType> lhsEstimatedElapsedTime;
            lhsEstimatedElapsedTime = (((this.estimatedElapsedTime!= null)&&(!this.estimatedElapsedTime.isEmpty()))?this.getEstimatedElapsedTime():null);
            List<EstimatedElapsedTimeType> rhsEstimatedElapsedTime;
            rhsEstimatedElapsedTime = (((that.estimatedElapsedTime!= null)&&(!that.estimatedElapsedTime.isEmpty()))?that.getEstimatedElapsedTime():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedElapsedTime", lhsEstimatedElapsedTime), LocatorUtils.property(thatLocator, "estimatedElapsedTime", rhsEstimatedElapsedTime), lhsEstimatedElapsedTime, rhsEstimatedElapsedTime)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsAirfileRouteStartTime;
            lhsAirfileRouteStartTime = this.getAirfileRouteStartTime();
            XMLGregorianCalendar rhsAirfileRouteStartTime;
            rhsAirfileRouteStartTime = that.getAirfileRouteStartTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airfileRouteStartTime", lhsAirfileRouteStartTime), LocatorUtils.property(thatLocator, "airfileRouteStartTime", rhsAirfileRouteStartTime), lhsAirfileRouteStartTime, rhsAirfileRouteStartTime)) {
                return false;
            }
        }
        {
            FlightRulesCategoryType lhsFlightRulesCategory;
            lhsFlightRulesCategory = this.getFlightRulesCategory();
            FlightRulesCategoryType rhsFlightRulesCategory;
            rhsFlightRulesCategory = that.getFlightRulesCategory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "flightRulesCategory", lhsFlightRulesCategory), LocatorUtils.property(thatLocator, "flightRulesCategory", rhsFlightRulesCategory), lhsFlightRulesCategory, rhsFlightRulesCategory)) {
                return false;
            }
        }
        {
            String lhsRouteText;
            lhsRouteText = this.getRouteText();
            String rhsRouteText;
            rhsRouteText = that.getRouteText();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routeText", lhsRouteText), LocatorUtils.property(thatLocator, "routeText", rhsRouteText), lhsRouteText, rhsRouteText)) {
                return false;
            }
        }
        {
            Duration lhsTotalEstimatedElapsedTime;
            lhsTotalEstimatedElapsedTime = this.getTotalEstimatedElapsedTime();
            Duration rhsTotalEstimatedElapsedTime;
            rhsTotalEstimatedElapsedTime = that.getTotalEstimatedElapsedTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalEstimatedElapsedTime", lhsTotalEstimatedElapsedTime), LocatorUtils.property(thatLocator, "totalEstimatedElapsedTime", rhsTotalEstimatedElapsedTime), lhsTotalEstimatedElapsedTime, rhsTotalEstimatedElapsedTime)) {
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
            FlightLevelOrAltitudeType theCruisingLevel;
            theCruisingLevel = this.getCruisingLevel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cruisingLevel", theCruisingLevel), currentHashCode, theCruisingLevel);
        }
        {
            TrueAirspeedType theCruisingSpeed;
            theCruisingSpeed = this.getCruisingSpeed();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cruisingSpeed", theCruisingSpeed), currentHashCode, theCruisingSpeed);
        }
        {
            List<EstimatedElapsedTimeType> theEstimatedElapsedTime;
            theEstimatedElapsedTime = (((this.estimatedElapsedTime!= null)&&(!this.estimatedElapsedTime.isEmpty()))?this.getEstimatedElapsedTime():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedElapsedTime", theEstimatedElapsedTime), currentHashCode, theEstimatedElapsedTime);
        }
        {
            XMLGregorianCalendar theAirfileRouteStartTime;
            theAirfileRouteStartTime = this.getAirfileRouteStartTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airfileRouteStartTime", theAirfileRouteStartTime), currentHashCode, theAirfileRouteStartTime);
        }
        {
            FlightRulesCategoryType theFlightRulesCategory;
            theFlightRulesCategory = this.getFlightRulesCategory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "flightRulesCategory", theFlightRulesCategory), currentHashCode, theFlightRulesCategory);
        }
        {
            String theRouteText;
            theRouteText = this.getRouteText();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routeText", theRouteText), currentHashCode, theRouteText);
        }
        {
            Duration theTotalEstimatedElapsedTime;
            theTotalEstimatedElapsedTime = this.getTotalEstimatedElapsedTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalEstimatedElapsedTime", theTotalEstimatedElapsedTime), currentHashCode, theTotalEstimatedElapsedTime);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
