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
import javax.xml.bind.annotation.XmlValue;
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
 *             The number referencing the air waybill. 
 *          
 * 
 * <p>Java class for AirWaybillType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirWaybillType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.fixm.aero/base/4.1>CharacterStringType">
 *       &lt;attribute name="airWaybillNumber" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirWaybillType", propOrder = {
    "value"
})
@Entity(name = "AirWaybillType")
@Table(name = "AIRWAYBILLTYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class AirWaybillType
    implements Equals, HashCode
{

    @XmlValue
    protected String value;
    @XmlAttribute(name = "airWaybillNumber")
    protected String airWaybillNumber;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;

    /**
     * 
     *             A sequence of characters [specialised from ISO19103, chapter 6.5.2.7]. 
     *              
     *             In FIXM, the maximum length of a CharacterString is set to 4096 characters. [FIXM] 
     *             
     *          
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "VALUE_", length = 4096)
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the airWaybillNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "AIRWAYBILLNUMBER", length = 4096)
    public String getAirWaybillNumber() {
        return airWaybillNumber;
    }

    /**
     * Sets the value of the airWaybillNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirWaybillNumber(String value) {
        this.airWaybillNumber = value;
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
        if (!(object instanceof AirWaybillType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final AirWaybillType that = ((AirWaybillType) object);
        {
            String lhsValue;
            lhsValue = this.getValue();
            String rhsValue;
            rhsValue = that.getValue();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "value", lhsValue), LocatorUtils.property(thatLocator, "value", rhsValue), lhsValue, rhsValue)) {
                return false;
            }
        }
        {
            String lhsAirWaybillNumber;
            lhsAirWaybillNumber = this.getAirWaybillNumber();
            String rhsAirWaybillNumber;
            rhsAirWaybillNumber = that.getAirWaybillNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "airWaybillNumber", lhsAirWaybillNumber), LocatorUtils.property(thatLocator, "airWaybillNumber", rhsAirWaybillNumber), lhsAirWaybillNumber, rhsAirWaybillNumber)) {
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
            String theValue;
            theValue = this.getValue();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "value", theValue), currentHashCode, theValue);
        }
        {
            String theAirWaybillNumber;
            theAirWaybillNumber = this.getAirWaybillNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "airWaybillNumber", theAirWaybillNumber), currentHashCode, theAirWaybillNumber);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}