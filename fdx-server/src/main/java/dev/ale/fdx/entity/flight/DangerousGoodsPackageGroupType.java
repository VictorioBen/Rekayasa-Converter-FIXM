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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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

import dev.ale.fdx.entity.base.ExtensibleType;


/**
 * 
 *             The part of the IATA Shipper's Declaration For Dangerous Goods that contains the 
 *             Package Details for the shipment. 
 *          
 * 
 * <p>Java class for DangerousGoodsPackageGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousGoodsPackageGroupType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="dangerousGoodsPackage" type="{http://www.fixm.aero/flight/4.1}DangerousGoodsPackageType" maxOccurs="2000" minOccurs="0"/>
 *         &lt;element name="shipmentDimensions" type="{http://www.fixm.aero/flight/4.1}DangerousGoodsDimensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="shipmentUseIndicator" type="{http://www.fixm.aero/flight/4.1}ShipmentUseType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousGoodsPackageGroupType", propOrder = {
    "dangerousGoodsPackage",
    "shipmentDimensions"
})
@Entity(name = "DangerousGoodsPackageGroupType")
@Table(name = "DANGEROUSGOODSPACKAGEGROUPTY_0")
public class DangerousGoodsPackageGroupType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected List<DangerousGoodsPackageType> dangerousGoodsPackage;
    protected DangerousGoodsDimensionsType shipmentDimensions;
    @XmlAttribute(name = "shipmentUseIndicator")
    protected ShipmentUseType shipmentUseIndicator;

    /**
     * Gets the value of the dangerousGoodsPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dangerousGoodsPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDangerousGoodsPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DangerousGoodsPackageType }
     * 
     * 
     */
    @OneToMany(targetEntity = DangerousGoodsPackageType.class, cascade = {
        CascadeType.ALL
    }, fetch = FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "DANGEROUSGOODSPACKAGE_DANGER_0")
    public List<DangerousGoodsPackageType> getDangerousGoodsPackage() {
        if (dangerousGoodsPackage == null) {
            dangerousGoodsPackage = new ArrayList<DangerousGoodsPackageType>();
        }
        return this.dangerousGoodsPackage;
    }

    /**
     * 
     * 
     */
    public void setDangerousGoodsPackage(List<DangerousGoodsPackageType> dangerousGoodsPackage) {
        this.dangerousGoodsPackage = dangerousGoodsPackage;
    }

    /**
     * Gets the value of the shipmentDimensions property.
     * 
     * @return
     *     possible object is
     *     {@link DangerousGoodsDimensionsType }
     *     
     */
    @ManyToOne(targetEntity = DangerousGoodsDimensionsType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "SHIPMENTDIMENSIONS_DANGEROUS_1")
    public DangerousGoodsDimensionsType getShipmentDimensions() {
        return shipmentDimensions;
    }

    /**
     * Sets the value of the shipmentDimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DangerousGoodsDimensionsType }
     *     
     */
    public void setShipmentDimensions(DangerousGoodsDimensionsType value) {
        this.shipmentDimensions = value;
    }

    /**
     * Gets the value of the shipmentUseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentUseType }
     *     
     */
    @Basic
    @Column(name = "SHIPMENTUSEINDICATOR", length = 255)
    @Enumerated(EnumType.STRING)
    public ShipmentUseType getShipmentUseIndicator() {
        return shipmentUseIndicator;
    }

    /**
     * Sets the value of the shipmentUseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentUseType }
     *     
     */
    public void setShipmentUseIndicator(ShipmentUseType value) {
        this.shipmentUseIndicator = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DangerousGoodsPackageGroupType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DangerousGoodsPackageGroupType that = ((DangerousGoodsPackageGroupType) object);
        {
            List<DangerousGoodsPackageType> lhsDangerousGoodsPackage;
            lhsDangerousGoodsPackage = (((this.dangerousGoodsPackage!= null)&&(!this.dangerousGoodsPackage.isEmpty()))?this.getDangerousGoodsPackage():null);
            List<DangerousGoodsPackageType> rhsDangerousGoodsPackage;
            rhsDangerousGoodsPackage = (((that.dangerousGoodsPackage!= null)&&(!that.dangerousGoodsPackage.isEmpty()))?that.getDangerousGoodsPackage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dangerousGoodsPackage", lhsDangerousGoodsPackage), LocatorUtils.property(thatLocator, "dangerousGoodsPackage", rhsDangerousGoodsPackage), lhsDangerousGoodsPackage, rhsDangerousGoodsPackage)) {
                return false;
            }
        }
        {
            DangerousGoodsDimensionsType lhsShipmentDimensions;
            lhsShipmentDimensions = this.getShipmentDimensions();
            DangerousGoodsDimensionsType rhsShipmentDimensions;
            rhsShipmentDimensions = that.getShipmentDimensions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentDimensions", lhsShipmentDimensions), LocatorUtils.property(thatLocator, "shipmentDimensions", rhsShipmentDimensions), lhsShipmentDimensions, rhsShipmentDimensions)) {
                return false;
            }
        }
        {
            ShipmentUseType lhsShipmentUseIndicator;
            lhsShipmentUseIndicator = this.getShipmentUseIndicator();
            ShipmentUseType rhsShipmentUseIndicator;
            rhsShipmentUseIndicator = that.getShipmentUseIndicator();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipmentUseIndicator", lhsShipmentUseIndicator), LocatorUtils.property(thatLocator, "shipmentUseIndicator", rhsShipmentUseIndicator), lhsShipmentUseIndicator, rhsShipmentUseIndicator)) {
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
            List<DangerousGoodsPackageType> theDangerousGoodsPackage;
            theDangerousGoodsPackage = (((this.dangerousGoodsPackage!= null)&&(!this.dangerousGoodsPackage.isEmpty()))?this.getDangerousGoodsPackage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dangerousGoodsPackage", theDangerousGoodsPackage), currentHashCode, theDangerousGoodsPackage);
        }
        {
            DangerousGoodsDimensionsType theShipmentDimensions;
            theShipmentDimensions = this.getShipmentDimensions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentDimensions", theShipmentDimensions), currentHashCode, theShipmentDimensions);
        }
        {
            ShipmentUseType theShipmentUseIndicator;
            theShipmentUseIndicator = this.getShipmentUseIndicator();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipmentUseIndicator", theShipmentUseIndicator), currentHashCode, theShipmentUseIndicator);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
