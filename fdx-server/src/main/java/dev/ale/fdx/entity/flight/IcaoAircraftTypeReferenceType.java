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
 *             A reference to an aircraft type designator as specified in ICAO Doc 8643, Aircraft 
 *             Type Designators. [FIXM] 
 *          
 * 
 * <p>Java class for IcaoAircraftTypeReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IcaoAircraftTypeReferenceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/flight/4.1}AircraftTypeReferenceType">
 *       &lt;attribute name="icaoAircraftTypeDesignator" type="{http://www.fixm.aero/base/4.1}AircraftTypeDesignatorType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IcaoAircraftTypeReferenceType")
@Entity(name = "IcaoAircraftTypeReferenceType")
@Table(name = "ICAOAIRCRAFTTYPEREFERENCETYPE")
public class IcaoAircraftTypeReferenceType
    extends AircraftTypeReferenceType
    implements Equals, HashCode
{

    @XmlAttribute(name = "icaoAircraftTypeDesignator")
    protected String icaoAircraftTypeDesignator;

    /**
     * Gets the value of the icaoAircraftTypeDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ICAOAIRCRAFTTYPEDESIGNATOR", length = 4096)
    public String getIcaoAircraftTypeDesignator() {
        return icaoAircraftTypeDesignator;
    }

    /**
     * Sets the value of the icaoAircraftTypeDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcaoAircraftTypeDesignator(String value) {
        this.icaoAircraftTypeDesignator = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof IcaoAircraftTypeReferenceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final IcaoAircraftTypeReferenceType that = ((IcaoAircraftTypeReferenceType) object);
        {
            String lhsIcaoAircraftTypeDesignator;
            lhsIcaoAircraftTypeDesignator = this.getIcaoAircraftTypeDesignator();
            String rhsIcaoAircraftTypeDesignator;
            rhsIcaoAircraftTypeDesignator = that.getIcaoAircraftTypeDesignator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "icaoAircraftTypeDesignator", lhsIcaoAircraftTypeDesignator), LocatorUtils.property(thatLocator, "icaoAircraftTypeDesignator", rhsIcaoAircraftTypeDesignator), lhsIcaoAircraftTypeDesignator, rhsIcaoAircraftTypeDesignator)) {
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
            String theIcaoAircraftTypeDesignator;
            theIcaoAircraftTypeDesignator = this.getIcaoAircraftTypeDesignator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "icaoAircraftTypeDesignator", theIcaoAircraftTypeDesignator), currentHashCode, theIcaoAircraftTypeDesignator);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
