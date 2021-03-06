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

import dev.ale.fdx.entity.base.AerodromeReferenceType;
import dev.ale.fdx.entity.base.ExtensibleType;


/**
 * 
 *             The route details to the revised destination aerodrome, followed by the ICAO four-letter 
 *             location indicator of 
 *             the aerodrome. The revised route is subject to reclearance in flight. [ICAO Doc 4444]" 
 *             
 *          
 * 
 * <p>Java class for ReclearanceInFlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReclearanceInFlightType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="filedRevisedDestinationAerodrome" type="{http://www.fixm.aero/base/4.1}AerodromeReferenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="routeToRevisedDestination" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReclearanceInFlightType", propOrder = {
    "filedRevisedDestinationAerodrome"
})
@Entity(name = "ReclearanceInFlightType")
@Table(name = "RECLEARANCEINFLIGHTTYPE")
public class ReclearanceInFlightType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected AerodromeReferenceType filedRevisedDestinationAerodrome;
    @XmlAttribute(name = "routeToRevisedDestination")
    protected String routeToRevisedDestination;

    /**
     * Gets the value of the filedRevisedDestinationAerodrome property.
     * 
     * @return
     *     possible object is
     *     {@link AerodromeReferenceType }
     *     
     */
    @ManyToOne(targetEntity = AerodromeReferenceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "FILEDREVISEDDESTINATIONAEROD_1")
    public AerodromeReferenceType getFiledRevisedDestinationAerodrome() {
        return filedRevisedDestinationAerodrome;
    }

    /**
     * Sets the value of the filedRevisedDestinationAerodrome property.
     * 
     * @param value
     *     allowed object is
     *     {@link AerodromeReferenceType }
     *     
     */
    public void setFiledRevisedDestinationAerodrome(AerodromeReferenceType value) {
        this.filedRevisedDestinationAerodrome = value;
    }

    /**
     * Gets the value of the routeToRevisedDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ROUTETOREVISEDDESTINATION", length = 4096)
    public String getRouteToRevisedDestination() {
        return routeToRevisedDestination;
    }

    /**
     * Sets the value of the routeToRevisedDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteToRevisedDestination(String value) {
        this.routeToRevisedDestination = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ReclearanceInFlightType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ReclearanceInFlightType that = ((ReclearanceInFlightType) object);
        {
            AerodromeReferenceType lhsFiledRevisedDestinationAerodrome;
            lhsFiledRevisedDestinationAerodrome = this.getFiledRevisedDestinationAerodrome();
            AerodromeReferenceType rhsFiledRevisedDestinationAerodrome;
            rhsFiledRevisedDestinationAerodrome = that.getFiledRevisedDestinationAerodrome();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "filedRevisedDestinationAerodrome", lhsFiledRevisedDestinationAerodrome), LocatorUtils.property(thatLocator, "filedRevisedDestinationAerodrome", rhsFiledRevisedDestinationAerodrome), lhsFiledRevisedDestinationAerodrome, rhsFiledRevisedDestinationAerodrome)) {
                return false;
            }
        }
        {
            String lhsRouteToRevisedDestination;
            lhsRouteToRevisedDestination = this.getRouteToRevisedDestination();
            String rhsRouteToRevisedDestination;
            rhsRouteToRevisedDestination = that.getRouteToRevisedDestination();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "routeToRevisedDestination", lhsRouteToRevisedDestination), LocatorUtils.property(thatLocator, "routeToRevisedDestination", rhsRouteToRevisedDestination), lhsRouteToRevisedDestination, rhsRouteToRevisedDestination)) {
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
            AerodromeReferenceType theFiledRevisedDestinationAerodrome;
            theFiledRevisedDestinationAerodrome = this.getFiledRevisedDestinationAerodrome();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "filedRevisedDestinationAerodrome", theFiledRevisedDestinationAerodrome), currentHashCode, theFiledRevisedDestinationAerodrome);
        }
        {
            String theRouteToRevisedDestination;
            theRouteToRevisedDestination = this.getRouteToRevisedDestination();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "routeToRevisedDestination", theRouteToRevisedDestination), currentHashCode, theRouteToRevisedDestination);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
