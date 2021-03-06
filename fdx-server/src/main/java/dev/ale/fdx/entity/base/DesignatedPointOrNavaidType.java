//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.base;

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


/**
 * 
 *             A named significant point, being either the site of a radio navigation aid or another 
 *             named geographical location, used in defining an ATS route, the flight path of an 
 *             aircraft or for other navigation or ATS purposes. [FIXM] 
 *              
 *             The coded designator of a navaid or designated point is not always sufficient for 
 *             unambiguously referring to that feature: 
 *             - The 5-letter coded designator of a waypoint is supposed to be unique world-wide 
 *             (according to ICAO Annex 11), but in reality it is not. There are at least 5% duplicates/triplicates/even 
 *             more? 
 *             - The en-route navaids (VOR, DME, NDB) designator is supposed to be unique (according 
 *             to ICAO Annex 11) within 600 NM. This means that these designators are not unique 
 *             world-wide. For airport navaids, there is no limitation. 
 *             The combinations of fields that would make the references unique are: 
 *             - For designated points: designator + position 
 *             - For navaids: designator + position + navaid service type 
 *             This FIXM class adds two optional properties 'position' and 'navaidServiceType' which 
 *             may be used as a complement to the 'designator' information in order to remove any 
 *             ambiguity on the coded designator. 
 *          
 * 
 * <p>Java class for DesignatedPointOrNavaidType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignatedPointOrNavaidType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}SignificantPointType">
 *       &lt;sequence>
 *         &lt;element name="position" type="{http://www.fixm.aero/base/4.1}GeographicalPositionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="designator" type="{http://www.fixm.aero/base/4.1}SignificantPointDesignatorType" />
 *       &lt;attribute name="navaidServiceType" type="{http://www.fixm.aero/base/4.1}NavaidServiceTypeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DesignatedPointOrNavaidType", propOrder = {
    "position"
})
@Entity(name = "DesignatedPointOrNavaidType")
@Table(name = "DESIGNATEDPOINTORNAVAIDTYPE")
public class DesignatedPointOrNavaidType
    extends SignificantPointType
    implements Equals, HashCode
{

    protected GeographicalPositionType position;
    @XmlAttribute(name = "designator")
    protected String designator;
    @XmlAttribute(name = "navaidServiceType")
    protected NavaidServiceTypeType navaidServiceType;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicalPositionType }
     *     
     */
    @ManyToOne(targetEntity = GeographicalPositionType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "POSITION__DESIGNATEDPOINTORN_0")
    public GeographicalPositionType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicalPositionType }
     *     
     */
    public void setPosition(GeographicalPositionType value) {
        this.position = value;
    }

    /**
     * Gets the value of the designator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESIGNATOR", length = 4096)
    public String getDesignator() {
        return designator;
    }

    /**
     * Sets the value of the designator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignator(String value) {
        this.designator = value;
    }

    /**
     * Gets the value of the navaidServiceType property.
     * 
     * @return
     *     possible object is
     *     {@link NavaidServiceTypeType }
     *     
     */
    @Basic
    @Column(name = "NAVAIDSERVICETYPE", length = 255)
    @Enumerated(EnumType.STRING)
    public NavaidServiceTypeType getNavaidServiceType() {
        return navaidServiceType;
    }

    /**
     * Sets the value of the navaidServiceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NavaidServiceTypeType }
     *     
     */
    public void setNavaidServiceType(NavaidServiceTypeType value) {
        this.navaidServiceType = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DesignatedPointOrNavaidType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DesignatedPointOrNavaidType that = ((DesignatedPointOrNavaidType) object);
        {
            GeographicalPositionType lhsPosition;
            lhsPosition = this.getPosition();
            GeographicalPositionType rhsPosition;
            rhsPosition = that.getPosition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "position", lhsPosition), LocatorUtils.property(thatLocator, "position", rhsPosition), lhsPosition, rhsPosition)) {
                return false;
            }
        }
        {
            String lhsDesignator;
            lhsDesignator = this.getDesignator();
            String rhsDesignator;
            rhsDesignator = that.getDesignator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designator", lhsDesignator), LocatorUtils.property(thatLocator, "designator", rhsDesignator), lhsDesignator, rhsDesignator)) {
                return false;
            }
        }
        {
            NavaidServiceTypeType lhsNavaidServiceType;
            lhsNavaidServiceType = this.getNavaidServiceType();
            NavaidServiceTypeType rhsNavaidServiceType;
            rhsNavaidServiceType = that.getNavaidServiceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "navaidServiceType", lhsNavaidServiceType), LocatorUtils.property(thatLocator, "navaidServiceType", rhsNavaidServiceType), lhsNavaidServiceType, rhsNavaidServiceType)) {
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
            GeographicalPositionType thePosition;
            thePosition = this.getPosition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "position", thePosition), currentHashCode, thePosition);
        }
        {
            String theDesignator;
            theDesignator = this.getDesignator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designator", theDesignator), currentHashCode, theDesignator);
        }
        {
            NavaidServiceTypeType theNavaidServiceType;
            theNavaidServiceType = this.getNavaidServiceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "navaidServiceType", theNavaidServiceType), currentHashCode, theNavaidServiceType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
