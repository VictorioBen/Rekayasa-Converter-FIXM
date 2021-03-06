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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
 *             En Route delay or holding planned to occur at a significant point or along a route 
 *             element. 
 *          
 * 
 * <p>Java class for EnRouteDelayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnRouteDelayType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;attribute name="delayReference" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *       &lt;attribute name="delayType" type="{http://www.fixm.aero/flight/4.1}EnRouteDelayTypeType" />
 *       &lt;attribute name="delayValue" type="{http://www.fixm.aero/base/4.1}DurationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnRouteDelayType")
@Entity(name = "EnRouteDelayType")
@Table(name = "ENROUTEDELAYTYPE")
public class EnRouteDelayType
    extends ExtensibleType
    implements Equals, HashCode
{

    @XmlAttribute(name = "delayReference")
    protected String delayReference;
    @XmlAttribute(name = "delayType")
    protected EnRouteDelayTypeType delayType;
    @XmlAttribute(name = "delayValue")
    protected Duration delayValue;

    /**
     * Gets the value of the delayReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DELAYREFERENCE", length = 4096)
    public String getDelayReference() {
        return delayReference;
    }

    /**
     * Sets the value of the delayReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayReference(String value) {
        this.delayReference = value;
    }

    /**
     * Gets the value of the delayType property.
     * 
     * @return
     *     possible object is
     *     {@link EnRouteDelayTypeType }
     *     
     */
    @Basic
    @Column(name = "DELAYTYPE", length = 255)
    @Enumerated(EnumType.STRING)
    public EnRouteDelayTypeType getDelayType() {
        return delayType;
    }

    /**
     * Sets the value of the delayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnRouteDelayTypeType }
     *     
     */
    public void setDelayType(EnRouteDelayTypeType value) {
        this.delayType = value;
    }

    /**
     * Gets the value of the delayValue property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    @Transient
    public Duration getDelayValue() {
        return delayValue;
    }

    /**
     * Sets the value of the delayValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDelayValue(Duration value) {
        this.delayValue = value;
    }

    @Basic
    @Column(name = "DELAYVALUEITEM", length = 127)
    public String getDelayValueItem() {
        return XmlAdapterUtils.unmarshall(DurationAsString.class, this.getDelayValue());
    }

    public void setDelayValueItem(String target) {
        setDelayValue(XmlAdapterUtils.marshall(DurationAsString.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EnRouteDelayType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final EnRouteDelayType that = ((EnRouteDelayType) object);
        {
            String lhsDelayReference;
            lhsDelayReference = this.getDelayReference();
            String rhsDelayReference;
            rhsDelayReference = that.getDelayReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delayReference", lhsDelayReference), LocatorUtils.property(thatLocator, "delayReference", rhsDelayReference), lhsDelayReference, rhsDelayReference)) {
                return false;
            }
        }
        {
            EnRouteDelayTypeType lhsDelayType;
            lhsDelayType = this.getDelayType();
            EnRouteDelayTypeType rhsDelayType;
            rhsDelayType = that.getDelayType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delayType", lhsDelayType), LocatorUtils.property(thatLocator, "delayType", rhsDelayType), lhsDelayType, rhsDelayType)) {
                return false;
            }
        }
        {
            Duration lhsDelayValue;
            lhsDelayValue = this.getDelayValue();
            Duration rhsDelayValue;
            rhsDelayValue = that.getDelayValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delayValue", lhsDelayValue), LocatorUtils.property(thatLocator, "delayValue", rhsDelayValue), lhsDelayValue, rhsDelayValue)) {
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
            String theDelayReference;
            theDelayReference = this.getDelayReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delayReference", theDelayReference), currentHashCode, theDelayReference);
        }
        {
            EnRouteDelayTypeType theDelayType;
            theDelayType = this.getDelayType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delayType", theDelayType), currentHashCode, theDelayType);
        }
        {
            Duration theDelayValue;
            theDelayValue = this.getDelayValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delayValue", theDelayValue), currentHashCode, theDelayValue);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
