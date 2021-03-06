//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

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

import dev.ale.fdx.entity.base.ExtensibleType;
import dev.ale.fdx.entity.base.SignificantPointType;


/**
 * 
 *             The position of the aircraft last known to ATS and a corresponding timestamp. 
 *          
 * 
 * <p>Java class for LastPositionReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LastPositionReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.fixm.aero/base/4.1}SignificantPointType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="determinationMethod" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *       &lt;attribute name="timeAtPosition" type="{http://www.fixm.aero/base/4.1}TimeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LastPositionReportType", propOrder = {
    "position"
})
@Entity(name = "LastPositionReportType")
@Table(name = "LASTPOSITIONREPORTTYPE")
public class LastPositionReportType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected SignificantPointType position;
    @XmlAttribute(name = "determinationMethod")
    protected String determinationMethod;
    @XmlAttribute(name = "timeAtPosition")
    protected XMLGregorianCalendar timeAtPosition;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link SignificantPointType }
     *     
     */
    @ManyToOne(targetEntity = SignificantPointType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "POSITION__LASTPOSITIONREPORT_0")
    public SignificantPointType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignificantPointType }
     *     
     */
    public void setPosition(SignificantPointType value) {
        this.position = value;
    }

    /**
     * Gets the value of the determinationMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DETERMINATIONMETHOD", length = 4096)
    public String getDeterminationMethod() {
        return determinationMethod;
    }

    /**
     * Sets the value of the determinationMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeterminationMethod(String value) {
        this.determinationMethod = value;
    }

    /**
     * Gets the value of the timeAtPosition property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Transient
    public XMLGregorianCalendar getTimeAtPosition() {
        return timeAtPosition;
    }

    /**
     * Sets the value of the timeAtPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimeAtPosition(XMLGregorianCalendar value) {
        this.timeAtPosition = value;
    }

    @Basic
    @Column(name = "TIMEATPOSITIONITEM")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTimeAtPositionItem() {
        return XmlAdapterUtils.unmarshall(XMLGregorianCalendarAsDateTime.class, this.getTimeAtPosition());
    }

    public void setTimeAtPositionItem(Date target) {
        setTimeAtPosition(XmlAdapterUtils.marshall(XMLGregorianCalendarAsDateTime.class, target));
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof LastPositionReportType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final LastPositionReportType that = ((LastPositionReportType) object);
        {
            SignificantPointType lhsPosition;
            lhsPosition = this.getPosition();
            SignificantPointType rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition)) {
                return false;
            }
        }
        {
            String lhsDeterminationMethod;
            lhsDeterminationMethod = this.getDeterminationMethod();
            String rhsDeterminationMethod;
            rhsDeterminationMethod = that.getDeterminationMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "determinationMethod", lhsDeterminationMethod), LocatorUtils.property(thatLocator, "determinationMethod", rhsDeterminationMethod), lhsDeterminationMethod, rhsDeterminationMethod)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTimeAtPosition;
            lhsTimeAtPosition = this.getTimeAtPosition();
            XMLGregorianCalendar rhsTimeAtPosition;
            rhsTimeAtPosition = that.getTimeAtPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeAtPosition", lhsTimeAtPosition), LocatorUtils.property(thatLocator, "timeAtPosition", rhsTimeAtPosition), lhsTimeAtPosition, rhsTimeAtPosition)) {
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
            SignificantPointType thePosition;
            thePosition = this.getPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "position", thePosition), currentHashCode, thePosition);
        }
        {
            String theDeterminationMethod;
            theDeterminationMethod = this.getDeterminationMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "determinationMethod", theDeterminationMethod), currentHashCode, theDeterminationMethod);
        }
        {
            XMLGregorianCalendar theTimeAtPosition;
            theTimeAtPosition = this.getTimeAtPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeAtPosition", theTimeAtPosition), currentHashCode, theTimeAtPosition);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
