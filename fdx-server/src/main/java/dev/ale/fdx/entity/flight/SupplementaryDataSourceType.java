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

import dev.ale.fdx.entity.base.AtcUnitReferenceType;
import dev.ale.fdx.entity.base.ExtensibleType;
import dev.ale.fdx.entity.base.PersonOrOrganizationType;


/**
 * 
 *             Describes the source of the supplementary data. Can be either a Person/Organization 
 *             or ATC Unit. 
 *              
 *             A Supplementary Information Source can be identified using a location identifier 
 *             (from Doc. 7910) for an ATS unit; an AFTN address; FF-ICE Participant identification 
 *             per B-2.28; or appropriate contact information per B-2.12. 
 *          
 * 
 * <p>Java class for SupplementaryDataSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplementaryDataSourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;choice>
 *         &lt;element name="personOrOrganization" type="{http://www.fixm.aero/base/4.1}PersonOrOrganizationType" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.fixm.aero/base/4.1}AtcUnitReferenceType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplementaryDataSourceType", propOrder = {
    "personOrOrganization",
    "unit"
})
@Entity(name = "SupplementaryDataSourceType")
@Table(name = "SUPPLEMENTARYDATASOURCETYPE")
public class SupplementaryDataSourceType
    extends ExtensibleType
    implements Equals, HashCode
{

    protected PersonOrOrganizationType personOrOrganization;
    protected AtcUnitReferenceType unit;

    /**
     * Gets the value of the personOrOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link PersonOrOrganizationType }
     *     
     */
    @ManyToOne(targetEntity = PersonOrOrganizationType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "PERSONORORGANIZATION_SUPPLEM_0")
    public PersonOrOrganizationType getPersonOrOrganization() {
        return personOrOrganization;
    }

    /**
     * Sets the value of the personOrOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonOrOrganizationType }
     *     
     */
    public void setPersonOrOrganization(PersonOrOrganizationType value) {
        this.personOrOrganization = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    @ManyToOne(targetEntity = AtcUnitReferenceType.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "UNIT_SUPPLEMENTARYDATASOURCE_0")
    public AtcUnitReferenceType getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link AtcUnitReferenceType }
     *     
     */
    public void setUnit(AtcUnitReferenceType value) {
        this.unit = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof SupplementaryDataSourceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final SupplementaryDataSourceType that = ((SupplementaryDataSourceType) object);
        {
            PersonOrOrganizationType lhsPersonOrOrganization;
            lhsPersonOrOrganization = this.getPersonOrOrganization();
            PersonOrOrganizationType rhsPersonOrOrganization;
            rhsPersonOrOrganization = that.getPersonOrOrganization();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "personOrOrganization", lhsPersonOrOrganization), LocatorUtils.property(thatLocator, "personOrOrganization", rhsPersonOrOrganization), lhsPersonOrOrganization, rhsPersonOrOrganization)) {
                return false;
            }
        }
        {
            AtcUnitReferenceType lhsUnit;
            lhsUnit = this.getUnit();
            AtcUnitReferenceType rhsUnit;
            rhsUnit = that.getUnit();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unit", lhsUnit), LocatorUtils.property(thatLocator, "unit", rhsUnit), lhsUnit, rhsUnit)) {
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
            PersonOrOrganizationType thePersonOrOrganization;
            thePersonOrOrganization = this.getPersonOrOrganization();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "personOrOrganization", thePersonOrOrganization), currentHashCode, thePersonOrOrganization);
        }
        {
            AtcUnitReferenceType theUnit;
            theUnit = this.getUnit();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unit", theUnit), currentHashCode, theUnit);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}