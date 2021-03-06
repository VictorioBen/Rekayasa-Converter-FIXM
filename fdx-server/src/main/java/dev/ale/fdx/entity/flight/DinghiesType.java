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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

import dev.ale.fdx.entity.base.ColourChoiceType;
import dev.ale.fdx.entity.base.ExtensionType;


/**
 * 
 *             Dinghy information including total capacity in persons of all dinghies carried, indicator 
 *             if dinghies are covered, their colours and number.  [ICAO Doc 4444, Appendix 2, ITEM 
 *             19 D] 
 *          
 * 
 * <p>Java class for DinghiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DinghiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensionType">
 *       &lt;sequence>
 *         &lt;element name="colour" type="{http://www.fixm.aero/base/4.1}ColourChoiceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="covered" type="{http://www.fixm.aero/flight/4.1}DinghyCoverIndicatorType" />
 *       &lt;attribute name="number" type="{http://www.fixm.aero/base/4.1}CountType" />
 *       &lt;attribute name="totalCapacity" type="{http://www.fixm.aero/base/4.1}CountType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DinghiesType", propOrder = {
    "colour"
})
@Entity(name = "DinghiesType")
@Table(name = "DINGHIESTYPE")
public class DinghiesType
    extends ExtensionType
    implements Equals, HashCode
{

    protected ColourChoiceType colour;
    @XmlAttribute(name = "covered")
    protected DinghyCoverIndicatorType covered;
    @XmlAttribute(name = "number")
    protected Integer number;
    @XmlAttribute(name = "totalCapacity")
    protected Integer totalCapacity;

    /**
     * Gets the value of the colour property.
     * 
     * @return
     *     possible object is
     *     {@link ColourChoiceType }
     *     
     */
    @ManyToOne(targetEntity = ColourChoiceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "COLOUR_DINGHIESTYPE_HJID")
    public ColourChoiceType getColour() {
        return colour;
    }

    /**
     * Sets the value of the colour property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColourChoiceType }
     *     
     */
    public void setColour(ColourChoiceType value) {
        this.colour = value;
    }

    /**
     * Gets the value of the covered property.
     * 
     * @return
     *     possible object is
     *     {@link DinghyCoverIndicatorType }
     *     
     */
    @Basic
    @Column(name = "COVERED", length = 255)
    @Enumerated(EnumType.STRING)
    public DinghyCoverIndicatorType getCovered() {
        return covered;
    }

    /**
     * Sets the value of the covered property.
     * 
     * @param value
     *     allowed object is
     *     {@link DinghyCoverIndicatorType }
     *     
     */
    public void setCovered(DinghyCoverIndicatorType value) {
        this.covered = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "NUMBER_", precision = 10, scale = 0)
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the totalCapacity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Basic
    @Column(name = "TOTALCAPACITY", precision = 10, scale = 0)
    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    /**
     * Sets the value of the totalCapacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCapacity(Integer value) {
        this.totalCapacity = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DinghiesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DinghiesType that = ((DinghiesType) object);
        {
            ColourChoiceType lhsColour;
            lhsColour = this.getColour();
            ColourChoiceType rhsColour;
            rhsColour = that.getColour();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "colour", lhsColour), LocatorUtils.property(thatLocator, "colour", rhsColour), lhsColour, rhsColour)) {
                return false;
            }
        }
        {
            DinghyCoverIndicatorType lhsCovered;
            lhsCovered = this.getCovered();
            DinghyCoverIndicatorType rhsCovered;
            rhsCovered = that.getCovered();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "covered", lhsCovered), LocatorUtils.property(thatLocator, "covered", rhsCovered), lhsCovered, rhsCovered)) {
                return false;
            }
        }
        {
            Integer lhsNumber;
            lhsNumber = this.getNumber();
            Integer rhsNumber;
            rhsNumber = that.getNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "number", lhsNumber), LocatorUtils.property(thatLocator, "number", rhsNumber), lhsNumber, rhsNumber)) {
                return false;
            }
        }
        {
            Integer lhsTotalCapacity;
            lhsTotalCapacity = this.getTotalCapacity();
            Integer rhsTotalCapacity;
            rhsTotalCapacity = that.getTotalCapacity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalCapacity", lhsTotalCapacity), LocatorUtils.property(thatLocator, "totalCapacity", rhsTotalCapacity), lhsTotalCapacity, rhsTotalCapacity)) {
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
            ColourChoiceType theColour;
            theColour = this.getColour();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "colour", theColour), currentHashCode, theColour);
        }
        {
            DinghyCoverIndicatorType theCovered;
            theCovered = this.getCovered();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "covered", theCovered), currentHashCode, theCovered);
        }
        {
            Integer theNumber;
            theNumber = this.getNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "number", theNumber), currentHashCode, theNumber);
        }
        {
            Integer theTotalCapacity;
            theTotalCapacity = this.getTotalCapacity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalCapacity", theTotalCapacity), currentHashCode, theTotalCapacity);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
