//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;

import dev.ale.fdx.entity.base.AerodromeReferenceType;
import dev.ale.fdx.entity.base.ExtensibleType;


/**
 * 
 *             The navigation capability of the aircraft and associated flight crew qualifications. 
 *             [FIXM] 
 *          
 * 
 * <p>Java class for NavigationCapabilitiesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NavigationCapabilitiesType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="navigationCapabilityCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.fixm.aero/flight/4.1}NavigationCapabilityCodeType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="performanceBasedCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.fixm.aero/flight/4.1}PerformanceBasedNavigationCapabilityCodeType" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="otherNavigationCapabilities" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NavigationCapabilitiesType", propOrder = {
    "navigationCapabilityCode",
    "performanceBasedCode"
})
@Entity(name = "NavigationCapabilitiesType")
@Table(name = "NAVIGATIONCAPABILITIESTYPE")
public class NavigationCapabilitiesType
    extends ExtensibleType
    implements Equals, HashCode
{

    @XmlList
    protected List<NavigationCapabilityCodeType> navigationCapabilityCode;
    @XmlList
    protected List<PerformanceBasedNavigationCapabilityCodeType> performanceBasedCode;
    @XmlAttribute(name = "otherNavigationCapabilities")
    protected String otherNavigationCapabilities;

    /**
     * Gets the value of the navigationCapabilityCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the navigationCapabilityCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNavigationCapabilityCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NavigationCapabilityCodeType }
     * 
     * 
     */
    @ElementCollection
    @OrderColumn(name = "HJINDEX")
    @Column(name = "HJVALUE")
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "NAVIGATIONCAPABILITIESTYPE_N_0", joinColumns = {
        @JoinColumn(name = "HJID")
    })
    public List<NavigationCapabilityCodeType> getNavigationCapabilityCode() {
        if (navigationCapabilityCode == null) {
            navigationCapabilityCode = new ArrayList<NavigationCapabilityCodeType>();
        }
        return this.navigationCapabilityCode;
    }

    /**
     * 
     * 
     */
    public void setNavigationCapabilityCode(List<NavigationCapabilityCodeType> navigationCapabilityCode) {
        this.navigationCapabilityCode = navigationCapabilityCode;
    }

    /**
     * Gets the value of the performanceBasedCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performanceBasedCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformanceBasedCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PerformanceBasedNavigationCapabilityCodeType }
     * 
     * 
     */
    @ElementCollection
    @OrderColumn(name = "HJINDEX")
    @Column(name = "HJVALUE")
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "NAVIGATIONCAPABILITIESTYPE_P_0", joinColumns = {
        @JoinColumn(name = "HJID")
    })
    public List<PerformanceBasedNavigationCapabilityCodeType> getPerformanceBasedCode() {
        if (performanceBasedCode == null) {
            performanceBasedCode = new ArrayList<PerformanceBasedNavigationCapabilityCodeType>();
        }
        return this.performanceBasedCode;
    }

    /**
     * 
     * 
     */
    public void setPerformanceBasedCode(List<PerformanceBasedNavigationCapabilityCodeType> performanceBasedCode) {
        this.performanceBasedCode = performanceBasedCode;
    }

    /**
     * Gets the value of the otherNavigationCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "OTHERNAVIGATIONCAPABILITIES", length = 4096)
    public String getOtherNavigationCapabilities() {
        return otherNavigationCapabilities;
    }

    /**
     * Sets the value of the otherNavigationCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNavigationCapabilities(String value) {
        this.otherNavigationCapabilities = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NavigationCapabilitiesType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final NavigationCapabilitiesType that = ((NavigationCapabilitiesType) object);
        {
            List<NavigationCapabilityCodeType> lhsNavigationCapabilityCode;
            lhsNavigationCapabilityCode = (((this.navigationCapabilityCode!= null)&&(!this.navigationCapabilityCode.isEmpty()))?this.getNavigationCapabilityCode():null);
            List<NavigationCapabilityCodeType> rhsNavigationCapabilityCode;
            rhsNavigationCapabilityCode = (((that.navigationCapabilityCode!= null)&&(!that.navigationCapabilityCode.isEmpty()))?that.getNavigationCapabilityCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "navigationCapabilityCode", lhsNavigationCapabilityCode), LocatorUtils.property(thatLocator, "navigationCapabilityCode", rhsNavigationCapabilityCode), lhsNavigationCapabilityCode, rhsNavigationCapabilityCode)) {
                return false;
            }
        }
        {
            List<PerformanceBasedNavigationCapabilityCodeType> lhsPerformanceBasedCode;
            lhsPerformanceBasedCode = (((this.performanceBasedCode!= null)&&(!this.performanceBasedCode.isEmpty()))?this.getPerformanceBasedCode():null);
            List<PerformanceBasedNavigationCapabilityCodeType> rhsPerformanceBasedCode;
            rhsPerformanceBasedCode = (((that.performanceBasedCode!= null)&&(!that.performanceBasedCode.isEmpty()))?that.getPerformanceBasedCode():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "performanceBasedCode", lhsPerformanceBasedCode), LocatorUtils.property(thatLocator, "performanceBasedCode", rhsPerformanceBasedCode), lhsPerformanceBasedCode, rhsPerformanceBasedCode)) {
                return false;
            }
        }
        {
            String lhsOtherNavigationCapabilities;
            lhsOtherNavigationCapabilities = this.getOtherNavigationCapabilities();
            String rhsOtherNavigationCapabilities;
            rhsOtherNavigationCapabilities = that.getOtherNavigationCapabilities();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "otherNavigationCapabilities", lhsOtherNavigationCapabilities), LocatorUtils.property(thatLocator, "otherNavigationCapabilities", rhsOtherNavigationCapabilities), lhsOtherNavigationCapabilities, rhsOtherNavigationCapabilities)) {
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
            List<NavigationCapabilityCodeType> theNavigationCapabilityCode;
            theNavigationCapabilityCode = (((this.navigationCapabilityCode!= null)&&(!this.navigationCapabilityCode.isEmpty()))?this.getNavigationCapabilityCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "navigationCapabilityCode", theNavigationCapabilityCode), currentHashCode, theNavigationCapabilityCode);
        }
        {
            List<PerformanceBasedNavigationCapabilityCodeType> thePerformanceBasedCode;
            thePerformanceBasedCode = (((this.performanceBasedCode!= null)&&(!this.performanceBasedCode.isEmpty()))?this.getPerformanceBasedCode():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "performanceBasedCode", thePerformanceBasedCode), currentHashCode, thePerformanceBasedCode);
        }
        {
            String theOtherNavigationCapabilities;
            theOtherNavigationCapabilities = this.getOtherNavigationCapabilities();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "otherNavigationCapabilities", theOtherNavigationCapabilities), currentHashCode, theOtherNavigationCapabilities);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}