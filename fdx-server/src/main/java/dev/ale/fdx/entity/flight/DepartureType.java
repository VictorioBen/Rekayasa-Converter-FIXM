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
import javax.xml.datatype.XMLGregorianCalendar;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
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

import dev.ale.fdx.entity.base.AerodromeReferenceType;
import dev.ale.fdx.entity.base.ExtensibleType;


/**
 * 
 *             Groups information pertaining to the flight's departure. 
 *          
 * 
 * <p>Java class for DepartureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepartureType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="aerodrome" type="{http://www.fixm.aero/base/4.1}AerodromeReferenceType" minOccurs="0"/>
 *         &lt;element name="takeoffAlternateAerodrome" type="{http://www.fixm.aero/base/4.1}AerodromeReferenceType" maxOccurs="2000" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="actualTimeOfDeparture" type="{http://www.fixm.aero/base/4.1}TimeType" />
 *       &lt;attribute name="airportSlotIdentification" type="{http://www.fixm.aero/base/4.1}AirportSlotIdentificationType" />
 *       &lt;attribute name="estimatedOffBlockTime" type="{http://www.fixm.aero/base/4.1}TimeType" />
 *       &lt;attribute name="runwayDirection" type="{http://www.fixm.aero/base/4.1}RunwayDirectionDesignatorType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepartureType", propOrder = {
    "aerodrome",
    "takeoffAlternateAerodrome"
})
@Entity(name = "DepartureType")
@Table(name = "DEPARTURETYPE")
public class DepartureType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected AerodromeReferenceType aerodrome;
    protected List<AerodromeReferenceType> takeoffAlternateAerodrome;
    @XmlAttribute(name = "actualTimeOfDeparture")
    protected XMLGregorianCalendar actualTimeOfDeparture;
    @XmlAttribute(name = "airportSlotIdentification")
    protected String airportSlotIdentification;
    @XmlAttribute(name = "estimatedOffBlockTime")
    protected XMLGregorianCalendar estimatedOffBlockTime;
    @XmlAttribute(name = "runwayDirection")
    protected String runwayDirection;

    /**
     * Gets the value of the aerodrome property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeReferenceType }
     *     
     */
    @ManyToOne(targetEntity = AerodromeReferenceType.class, cascade = {
            CascadeType.ALL
        })
    @JoinColumn(name = "AERODROME_DEPARTURETYPE_HJID")
    public AerodromeReferenceType getAerodrome() {
        return aerodrome;
    }

    /**
     * Sets the value of the aerodrome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeReferenceType }
     *     
     */
    public void setAerodrome(AerodromeReferenceType value) {
        this.aerodrome = value;
    }

    /**
     * Gets the value of the takeoffAlternateAerodrome property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the takeoffAlternateAerodrome property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTakeoffAlternateAerodrome().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AerodromeReferenceType }
     * 
     * 
     */
    @OneToMany(targetEntity = AerodromeReferenceType.class, cascade = {
        CascadeType.ALL
    },fetch = FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "TAKEOFFALTERNATEAERODROME_DE_0")
    public List<AerodromeReferenceType> getTakeoffAlternateAerodrome() {
        if (takeoffAlternateAerodrome == null) {
            takeoffAlternateAerodrome = new ArrayList<AerodromeReferenceType>();
        }
        return this.takeoffAlternateAerodrome;
    }

    /**
     * 
     * 
     */
    public void setTakeoffAlternateAerodrome(List<AerodromeReferenceType> takeoffAlternateAerodrome) {
        this.takeoffAlternateAerodrome = takeoffAlternateAerodrome;
    }

    /**
     * Gets the value of the actualTimeOfDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getActualTimeOfDeparture() {
        return actualTimeOfDeparture;
    }

    /**
     * Sets the value of the actualTimeOfDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualTimeOfDeparture(XMLGregorianCalendar value) {
        this.actualTimeOfDeparture = value;
    }

    /**
     * Gets the value of the airportSlotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AIRPORTSLOTIDENTIFICATION", length = 10)
    public String getAirportSlotIdentification() {
        return airportSlotIdentification;
    }

    /**
     * Sets the value of the airportSlotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportSlotIdentification(String value) {
        this.airportSlotIdentification = value;
    }

    /**
     * Gets the value of the estimatedOffBlockTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getEstimatedOffBlockTime() {
        return estimatedOffBlockTime;
    }

    /**
     * Sets the value of the estimatedOffBlockTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedOffBlockTime(XMLGregorianCalendar value) {
        this.estimatedOffBlockTime = value;
    }

    /**
     * Gets the value of the runwayDirection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "RUNWAYDIRECTION", length = 4096)
    public String getRunwayDirection() {
        return runwayDirection;
    }

    /**
     * Sets the value of the runwayDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunwayDirection(String value) {
        this.runwayDirection = value;
    }

    @Basic
    @Column(name = "ACTUALTIMEOFDEPARTUREITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getActualTimeOfDepartureItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getActualTimeOfDeparture());
    }

    public void setActualTimeOfDepartureItem(Date target) {
        setActualTimeOfDeparture(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    @Basic
    @Column(name = "ESTIMATEDOFFBLOCKTIMEITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getEstimatedOffBlockTimeItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getEstimatedOffBlockTime());
    }

    public void setEstimatedOffBlockTimeItem(Date target) {
        setEstimatedOffBlockTime(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DepartureType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DepartureType that = ((DepartureType) object);
        {
            AerodromeReferenceType lhsAerodrome;
            lhsAerodrome = this.getAerodrome();
            AerodromeReferenceType rhsAerodrome;
            rhsAerodrome = that.getAerodrome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "aerodrome", lhsAerodrome), LocatorUtils.property(thatLocator, "aerodrome", rhsAerodrome), lhsAerodrome, rhsAerodrome)) {
                return false;
            }
        }
        {
            List<AerodromeReferenceType> lhsTakeoffAlternateAerodrome;
            lhsTakeoffAlternateAerodrome = (((this.takeoffAlternateAerodrome!= null)&&(!this.takeoffAlternateAerodrome.isEmpty()))?this.getTakeoffAlternateAerodrome():null);
            List<AerodromeReferenceType> rhsTakeoffAlternateAerodrome;
            rhsTakeoffAlternateAerodrome = (((that.takeoffAlternateAerodrome!= null)&&(!that.takeoffAlternateAerodrome.isEmpty()))?that.getTakeoffAlternateAerodrome():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "takeoffAlternateAerodrome", lhsTakeoffAlternateAerodrome), LocatorUtils.property(thatLocator, "takeoffAlternateAerodrome", rhsTakeoffAlternateAerodrome), lhsTakeoffAlternateAerodrome, rhsTakeoffAlternateAerodrome)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsActualTimeOfDeparture;
            lhsActualTimeOfDeparture = this.getActualTimeOfDeparture();
            XMLGregorianCalendar rhsActualTimeOfDeparture;
            rhsActualTimeOfDeparture = that.getActualTimeOfDeparture();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "actualTimeOfDeparture", lhsActualTimeOfDeparture), LocatorUtils.property(thatLocator, "actualTimeOfDeparture", rhsActualTimeOfDeparture), lhsActualTimeOfDeparture, rhsActualTimeOfDeparture)) {
                return false;
            }
        }
        {
            String lhsAirportSlotIdentification;
            lhsAirportSlotIdentification = this.getAirportSlotIdentification();
            String rhsAirportSlotIdentification;
            rhsAirportSlotIdentification = that.getAirportSlotIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airportSlotIdentification", lhsAirportSlotIdentification), LocatorUtils.property(thatLocator, "airportSlotIdentification", rhsAirportSlotIdentification), lhsAirportSlotIdentification, rhsAirportSlotIdentification)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEstimatedOffBlockTime;
            lhsEstimatedOffBlockTime = this.getEstimatedOffBlockTime();
            XMLGregorianCalendar rhsEstimatedOffBlockTime;
            rhsEstimatedOffBlockTime = that.getEstimatedOffBlockTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "estimatedOffBlockTime", lhsEstimatedOffBlockTime), LocatorUtils.property(thatLocator, "estimatedOffBlockTime", rhsEstimatedOffBlockTime), lhsEstimatedOffBlockTime, rhsEstimatedOffBlockTime)) {
                return false;
            }
        }
        {
            String lhsRunwayDirection;
            lhsRunwayDirection = this.getRunwayDirection();
            String rhsRunwayDirection;
            rhsRunwayDirection = that.getRunwayDirection();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "runwayDirection", lhsRunwayDirection), LocatorUtils.property(thatLocator, "runwayDirection", rhsRunwayDirection), lhsRunwayDirection, rhsRunwayDirection)) {
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
            AerodromeReferenceType theAerodrome;
            theAerodrome = this.getAerodrome();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aerodrome", theAerodrome), currentHashCode, theAerodrome);
        }
        {
            List<AerodromeReferenceType> theTakeoffAlternateAerodrome;
            theTakeoffAlternateAerodrome = (((this.takeoffAlternateAerodrome!= null)&&(!this.takeoffAlternateAerodrome.isEmpty()))?this.getTakeoffAlternateAerodrome():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "takeoffAlternateAerodrome", theTakeoffAlternateAerodrome), currentHashCode, theTakeoffAlternateAerodrome);
        }
        {
            XMLGregorianCalendar theActualTimeOfDeparture;
            theActualTimeOfDeparture = this.getActualTimeOfDeparture();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "actualTimeOfDeparture", theActualTimeOfDeparture), currentHashCode, theActualTimeOfDeparture);
        }
        {
            String theAirportSlotIdentification;
            theAirportSlotIdentification = this.getAirportSlotIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airportSlotIdentification", theAirportSlotIdentification), currentHashCode, theAirportSlotIdentification);
        }
        {
            XMLGregorianCalendar theEstimatedOffBlockTime;
            theEstimatedOffBlockTime = this.getEstimatedOffBlockTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "estimatedOffBlockTime", theEstimatedOffBlockTime), currentHashCode, theEstimatedOffBlockTime);
        }
        {
            String theRunwayDirection;
            theRunwayDirection = this.getRunwayDirection();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "runwayDirection", theRunwayDirection), currentHashCode, theRunwayDirection);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
