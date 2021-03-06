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
 *             A person, organization or enterprise engaged in or offering to engage in an aircraft 
 *             operation. [ICAO Annex 9] 
 *          
 * 
 * <p>Java class for AircraftOperatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftOperatorType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;sequence>
 *         &lt;element name="operatingOrganization" type="{http://www.fixm.aero/base/4.1}PersonOrOrganizationType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="designatorIcao" type="{http://www.fixm.aero/base/4.1}AircraftOperatorDesignatorType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftOperatorType", propOrder = {
    "operatingOrganization"
})
@Entity(name = "AircraftOperatorType")
@Table(name = "AIRCRAFTOPERATORTYPE")
public class AircraftOperatorType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected PersonOrOrganizationType operatingOrganization;
    @XmlAttribute(name = "designatorIcao")
    protected String designatorIcao;

    /**
     * Gets the value of the operatingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganizationType }
     *     
     */
    @ManyToOne(targetEntity = PersonOrOrganizationType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "OPERATINGORGANIZATION_AIRCRA_0")
    public PersonOrOrganizationType getOperatingOrganization() {
        return operatingOrganization;
    }

    /**
     * Sets the value of the operatingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganizationType }
     *     
     */
    public void setOperatingOrganization(PersonOrOrganizationType value) {
        this.operatingOrganization = value;
    }

    /**
     * Gets the value of the designatorIcao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "DESIGNATORICAO", length = 4096)
    public String getDesignatorIcao() {
        return designatorIcao;
    }

    /**
     * Sets the value of the designatorIcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignatorIcao(String value) {
        this.designatorIcao = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof AircraftOperatorType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final AircraftOperatorType that = ((AircraftOperatorType) object);
        {
            PersonOrOrganizationType lhsOperatingOrganization;
            lhsOperatingOrganization = this.getOperatingOrganization();
            PersonOrOrganizationType rhsOperatingOrganization;
            rhsOperatingOrganization = that.getOperatingOrganization();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatingOrganization", lhsOperatingOrganization), LocatorUtils.property(thatLocator, "operatingOrganization", rhsOperatingOrganization), lhsOperatingOrganization, rhsOperatingOrganization)) {
                return false;
            }
        }
        {
            String lhsDesignatorIcao;
            lhsDesignatorIcao = this.getDesignatorIcao();
            String rhsDesignatorIcao;
            rhsDesignatorIcao = that.getDesignatorIcao();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "designatorIcao", lhsDesignatorIcao), LocatorUtils.property(thatLocator, "designatorIcao", rhsDesignatorIcao), lhsDesignatorIcao, rhsDesignatorIcao)) {
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
            PersonOrOrganizationType theOperatingOrganization;
            theOperatingOrganization = this.getOperatingOrganization();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatingOrganization", theOperatingOrganization), currentHashCode, theOperatingOrganization);
        }
        {
            String theDesignatorIcao;
            theDesignatorIcao = this.getDesignatorIcao();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "designatorIcao", theDesignatorIcao), currentHashCode, theDesignatorIcao);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
