//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
import dev.ale.fdx.entity.base.VolumeType;
import dev.ale.fdx.entity.base.WeightType;


/**
 * 
 *             Weight and volume (not height, width, and depth): 
 *          
 * 
 * <p>Java class for DangerousGoodsDimensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DangerousGoodsDimensionsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="grossWeight" type="{http://www.fixm.aero/base/4.1}WeightType" minOccurs="0"/>
 *         &lt;element name="netWeight" type="{http://www.fixm.aero/base/4.1}WeightType" minOccurs="0"/>
 *         &lt;element name="volume" type="{http://www.fixm.aero/base/4.1}VolumeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DangerousGoodsDimensionsType", propOrder = {
    "grossWeight",
    "netWeight",
    "volume"
})
@Entity(name = "DangerousGoodsDimensionsType")
@Table(name = "DANGEROUSGOODSDIMENSIONSTYPE")
public class DangerousGoodsDimensionsType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected WeightType grossWeight;
    protected WeightType netWeight;
    protected VolumeType volume;

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    @ManyToOne(targetEntity = WeightType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "GROSSWEIGHT_DANGEROUSGOODSDI_0")
    public WeightType getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setGrossWeight(WeightType value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    @ManyToOne(targetEntity = WeightType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "NETWEIGHT_DANGEROUSGOODSDIME_0")
    public WeightType getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setNetWeight(WeightType value) {
        this.netWeight = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link VolumeType }
     *     
     */
    @ManyToOne(targetEntity = VolumeType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "VOLUME_DANGEROUSGOODSDIMENSI_0")
    public VolumeType getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link VolumeType }
     *     
     */
    public void setVolume(VolumeType value) {
        this.volume = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DangerousGoodsDimensionsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DangerousGoodsDimensionsType that = ((DangerousGoodsDimensionsType) object);
        {
            WeightType lhsGrossWeight;
            lhsGrossWeight = this.getGrossWeight();
            WeightType rhsGrossWeight;
            rhsGrossWeight = that.getGrossWeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "grossWeight", lhsGrossWeight), LocatorUtils.property(thatLocator, "grossWeight", rhsGrossWeight), lhsGrossWeight, rhsGrossWeight)) {
                return false;
            }
        }
        {
            WeightType lhsNetWeight;
            lhsNetWeight = this.getNetWeight();
            WeightType rhsNetWeight;
            rhsNetWeight = that.getNetWeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "netWeight", lhsNetWeight), LocatorUtils.property(thatLocator, "netWeight", rhsNetWeight), lhsNetWeight, rhsNetWeight)) {
                return false;
            }
        }
        {
            VolumeType lhsVolume;
            lhsVolume = this.getVolume();
            VolumeType rhsVolume;
            rhsVolume = that.getVolume();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "volume", lhsVolume), LocatorUtils.property(thatLocator, "volume", rhsVolume), lhsVolume, rhsVolume)) {
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
            WeightType theGrossWeight;
            theGrossWeight = this.getGrossWeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "grossWeight", theGrossWeight), currentHashCode, theGrossWeight);
        }
        {
            WeightType theNetWeight;
            theNetWeight = this.getNetWeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "netWeight", theNetWeight), currentHashCode, theNetWeight);
        }
        {
            VolumeType theVolume;
            theVolume = this.getVolume();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "volume", theVolume), currentHashCode, theVolume);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
