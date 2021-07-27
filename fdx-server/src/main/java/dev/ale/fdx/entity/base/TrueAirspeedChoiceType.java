//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.base;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *             The true airspeed choice indicates that indicated airspeed can either be expressed 
 *             as specific with a speed condition or a speed range between lower and upper bounds. 
 *             
 *          
 * 
 * <p>Java class for TrueAirspeedChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrueAirspeedChoiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;choice>
 *         &lt;element name="airspeedRange" type="{http://www.fixm.aero/base/4.1}TrueAirspeedRangeType" minOccurs="0"/>
 *         &lt;element name="airspeedValue" type="{http://www.fixm.aero/base/4.1}TrueAirspeedType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrueAirspeedChoiceType", propOrder = {
    "airspeedRange",
    "airspeedValue"
})
@Entity(name = "TrueAirspeedChoiceType")
@Table(name = "TRUEAIRSPEEDCHOICETYPE")
public class TrueAirspeedChoiceType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected TrueAirspeedRangeType airspeedRange;
    protected TrueAirspeedType airspeedValue;

    /**
     * Gets the value of the airspeedRange property.
     * 
     * @return
     *     possible object is
     *     {@link TrueAirspeedRangeType }
     *     
     */
    @ManyToOne(targetEntity = TrueAirspeedRangeType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AIRSPEEDRANGE_TRUEAIRSPEEDCH_0")
    public TrueAirspeedRangeType getAirspeedRange() {
        return airspeedRange;
    }

    /**
     * Sets the value of the airspeedRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueAirspeedRangeType }
     *     
     */
    public void setAirspeedRange(TrueAirspeedRangeType value) {
        this.airspeedRange = value;
    }

    /**
     * Gets the value of the airspeedValue property.
     * 
     * @return
     *     possible object is
     *     {@link TrueAirspeedType }
     *     
     */
    @ManyToOne(targetEntity = TrueAirspeedType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "AIRSPEEDVALUE_TRUEAIRSPEEDCH_0")
    public TrueAirspeedType getAirspeedValue() {
        return airspeedValue;
    }

    /**
     * Sets the value of the airspeedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrueAirspeedType }
     *     
     */
    public void setAirspeedValue(TrueAirspeedType value) {
        this.airspeedValue = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TrueAirspeedChoiceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final TrueAirspeedChoiceType that = ((TrueAirspeedChoiceType) object);
        {
            TrueAirspeedRangeType lhsAirspeedRange;
            lhsAirspeedRange = this.getAirspeedRange();
            TrueAirspeedRangeType rhsAirspeedRange;
            rhsAirspeedRange = that.getAirspeedRange();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airspeedRange", lhsAirspeedRange), LocatorUtils.property(thatLocator, "airspeedRange", rhsAirspeedRange), lhsAirspeedRange, rhsAirspeedRange)) {
                return false;
            }
        }
        {
            TrueAirspeedType lhsAirspeedValue;
            lhsAirspeedValue = this.getAirspeedValue();
            TrueAirspeedType rhsAirspeedValue;
            rhsAirspeedValue = that.getAirspeedValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airspeedValue", lhsAirspeedValue), LocatorUtils.property(thatLocator, "airspeedValue", rhsAirspeedValue), lhsAirspeedValue, rhsAirspeedValue)) {
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
            TrueAirspeedRangeType theAirspeedRange;
            theAirspeedRange = this.getAirspeedRange();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airspeedRange", theAirspeedRange), currentHashCode, theAirspeedRange);
        }
        {
            TrueAirspeedType theAirspeedValue;
            theAirspeedValue = this.getAirspeedValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airspeedValue", theAirspeedValue), currentHashCode, theAirspeedValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
