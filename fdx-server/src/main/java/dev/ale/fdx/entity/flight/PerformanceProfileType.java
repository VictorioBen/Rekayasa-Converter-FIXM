//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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

import dev.ale.fdx.entity.base.ExtensibleType;


/**
 * 
 *             A zero-wind, standard atmosphere, unconstrained movement profile reflective of the 
 *             flight capabilities and desired parameters during climb or descent. 
 *          
 * 
 * <p>Java class for PerformanceProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PerformanceProfileType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="profilePoint" type="{http://www.fixm.aero/flight/4.1}ProfilePointType" maxOccurs="2000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PerformanceProfileType", propOrder = {
    "profilePoint"
})
@Entity(name = "PerformanceProfileType")
@Table(name = "PERFORMANCEPROFILETYPE")
public class PerformanceProfileType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected List<ProfilePointType> profilePoint;

    /**
     * Gets the value of the profilePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profilePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfilePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfilePointType }
     * 
     * 
     */
    @OneToMany(targetEntity = ProfilePointType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PROFILEPOINT_PERFORMANCEPROF_0")
    public List<ProfilePointType> getProfilePoint() {
        if (profilePoint == null) {
            profilePoint = new ArrayList<ProfilePointType>();
        }
        return this.profilePoint;
    }

    /**
     * 
     * 
     */
    public void setProfilePoint(List<ProfilePointType> profilePoint) {
        this.profilePoint = profilePoint;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PerformanceProfileType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PerformanceProfileType that = ((PerformanceProfileType) object);
        {
            List<ProfilePointType> lhsProfilePoint;
            lhsProfilePoint = (((this.profilePoint!= null)&&(!this.profilePoint.isEmpty()))?this.getProfilePoint():null);
            List<ProfilePointType> rhsProfilePoint;
            rhsProfilePoint = (((that.profilePoint!= null)&&(!that.profilePoint.isEmpty()))?that.getProfilePoint():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "profilePoint", lhsProfilePoint), LocatorUtils.property(thatLocator, "profilePoint", rhsProfilePoint), lhsProfilePoint, rhsProfilePoint)) {
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
            List<ProfilePointType> theProfilePoint;
            theProfilePoint = (((this.profilePoint!= null)&&(!this.profilePoint.isEmpty()))?this.getProfilePoint():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "profilePoint", theProfilePoint), currentHashCode, theProfilePoint);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
