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

import dev.ale.fdx.entity.base.ExtensibleType;


/**
 * 
 *             A candidate 4D Trajectory, with tolerances supplied if necessary by the airspace 
 *             user to define when the next ranked trajectory should be used. 
 *             This is the route associated with a single Ranked 4D trajectory for a flight.  It 
 *             indicates the intent of the flight and includes the path over the surface of the 
 *             earth, the altitude and the speed for the flight. 
 *          
 * 
 * <p>Java class for RankedTrajectoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RankedTrajectoryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="routeTrajectory" type="{http://www.fixm.aero/flight/4.1}RouteTrajectoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="identifier">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.fixm.aero/base/4.1}CharacterStringType">
 *             &lt;pattern value="[0-9]{1,2}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RankedTrajectoryType", propOrder = {
    "routeTrajectory"
})
@Entity(name = "RankedTrajectoryType")
@Table(name = "RANKEDTRAJECTORYTYPE")
public class RankedTrajectoryType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected RouteTrajectoryType routeTrajectory;
    @XmlAttribute(name = "identifier")
    protected String identifier;

    /**
     * Gets the value of the routeTrajectory property.
     * 
     * @return
     *     possible object is
     *     {@link RouteTrajectoryType }
     *     
     */
    @ManyToOne(targetEntity = RouteTrajectoryType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "ROUTETRAJECTORY_RANKEDTRAJEC_0")
    public RouteTrajectoryType getRouteTrajectory() {
        return routeTrajectory;
    }

    /**
     * Sets the value of the routeTrajectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteTrajectoryType }
     *     
     */
    public void setRouteTrajectory(RouteTrajectoryType value) {
        this.routeTrajectory = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "IDENTIFIER", length = 4096)
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RankedTrajectoryType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RankedTrajectoryType that = ((RankedTrajectoryType) object);
        {
            RouteTrajectoryType lhsRouteTrajectory;
            lhsRouteTrajectory = this.getRouteTrajectory();
            RouteTrajectoryType rhsRouteTrajectory;
            rhsRouteTrajectory = that.getRouteTrajectory();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routeTrajectory", lhsRouteTrajectory), LocatorUtils.property(thatLocator, "routeTrajectory", rhsRouteTrajectory), lhsRouteTrajectory, rhsRouteTrajectory)) {
                return false;
            }
        }
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier)) {
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
            RouteTrajectoryType theRouteTrajectory;
            theRouteTrajectory = this.getRouteTrajectory();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routeTrajectory", theRouteTrajectory), currentHashCode, theRouteTrajectory);
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
