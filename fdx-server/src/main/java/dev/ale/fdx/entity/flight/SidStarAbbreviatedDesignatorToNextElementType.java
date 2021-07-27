//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * 
 *             The shortened designator of a SID or a STAR to the next element on the route, as 
 *             a complement to RouteDesignatorToNextElement.[FIXM] 
 *              
 *             Limitations in the display equipment on board aircraft may require shortening of 
 *             the basic indicator of the SID or STAR designator. [derived from ICAO Annex 11, Appendix 
 *             3, chapter 2.2].  This optional name may be provided in FIXM when the SID or STAR 
 *             designator is seven characters. 
 *              
 *             Shortened names [...] are used in FMS databases and in some ground automation systems. 
 *             Making both names available allows each system to use the designator consistent with 
 *             their database. Note also, that as automated uplink of clearances to aircraft is 
 *             implemented a ground system using the seven-character name will need to upload the 
 *             shorter name for it to load to the FMS successfully. [FF-ICE Implementation Guidance 
 *             Manual] 
 *          
 * 
 * <p>Java class for SidStarAbbreviatedDesignatorToNextElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SidStarAbbreviatedDesignatorToNextElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="sidAbbreviatedDesignator" type="{http://www.fixm.aero/base/4.1}SidStarAbbreviatedDesignatorType" minOccurs="0"/>
 *         &lt;element name="starAbbreviatedDesignator" type="{http://www.fixm.aero/base/4.1}SidStarAbbreviatedDesignatorType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SidStarAbbreviatedDesignatorToNextElementType", propOrder = {
    "sidAbbreviatedDesignator",
    "starAbbreviatedDesignator"
})
@Entity(name = "SidStarAbbreviatedDesignatorToNextElementType")
@Table(name = "SIDSTARABBREVIATEDDESIGNATOR_2")
@Inheritance(strategy = InheritanceType.JOINED)
public class SidStarAbbreviatedDesignatorToNextElementType
    implements Equals, HashCode
{

    protected String sidAbbreviatedDesignator;
    protected String starAbbreviatedDesignator;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * Gets the value of the sidAbbreviatedDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SIDABBREVIATEDDESIGNATOR", length = 6)
    public String getSidAbbreviatedDesignator() {
        return sidAbbreviatedDesignator;
    }

    /**
     * Sets the value of the sidAbbreviatedDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSidAbbreviatedDesignator(String value) {
        this.sidAbbreviatedDesignator = value;
    }

    /**
     * Gets the value of the starAbbreviatedDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "STARABBREVIATEDDESIGNATOR", length = 6)
    public String getStarAbbreviatedDesignator() {
        return starAbbreviatedDesignator;
    }

    /**
     * Sets the value of the starAbbreviatedDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStarAbbreviatedDesignator(String value) {
        this.starAbbreviatedDesignator = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SidStarAbbreviatedDesignatorToNextElementType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SidStarAbbreviatedDesignatorToNextElementType that = ((SidStarAbbreviatedDesignatorToNextElementType) object);
        {
            String lhsSidAbbreviatedDesignator;
            lhsSidAbbreviatedDesignator = this.getSidAbbreviatedDesignator();
            String rhsSidAbbreviatedDesignator;
            rhsSidAbbreviatedDesignator = that.getSidAbbreviatedDesignator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sidAbbreviatedDesignator", lhsSidAbbreviatedDesignator), LocatorUtils.property(thatLocator, "sidAbbreviatedDesignator", rhsSidAbbreviatedDesignator), lhsSidAbbreviatedDesignator, rhsSidAbbreviatedDesignator)) {
                return false;
            }
        }
        {
            String lhsStarAbbreviatedDesignator;
            lhsStarAbbreviatedDesignator = this.getStarAbbreviatedDesignator();
            String rhsStarAbbreviatedDesignator;
            rhsStarAbbreviatedDesignator = that.getStarAbbreviatedDesignator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "starAbbreviatedDesignator", lhsStarAbbreviatedDesignator), LocatorUtils.property(thatLocator, "starAbbreviatedDesignator", rhsStarAbbreviatedDesignator), lhsStarAbbreviatedDesignator, rhsStarAbbreviatedDesignator)) {
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
        int currentHashCode = 1;
        {
            String theSidAbbreviatedDesignator;
            theSidAbbreviatedDesignator = this.getSidAbbreviatedDesignator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sidAbbreviatedDesignator", theSidAbbreviatedDesignator), currentHashCode, theSidAbbreviatedDesignator);
        }
        {
            String theStarAbbreviatedDesignator;
            theStarAbbreviatedDesignator = this.getStarAbbreviatedDesignator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "starAbbreviatedDesignator", theStarAbbreviatedDesignator), currentHashCode, theStarAbbreviatedDesignator);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}