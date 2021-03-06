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

import dev.ale.fdx.entity.base.ExtensibleType;


/**
 * 
 *             The consignor's statement indicating the dangerous goods have been packaged and handled 
 *             according to regulations. 
 *             This shipper's statement indicating the dangerous goods have been packaged and handled 
 *             according to regulations. 
 *             The warning message for not complying with the regulations. 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;deprecated xmlns="http://www.w3.org/2001/XMLSchema" xmlns:fb="http://www.fixm.aero/base/4.1" xmlns:fx="http://www.fixm.aero/flight/4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;deletionVersion&gt;5.0.0&lt;/deletionVersion&gt;&lt;deprecationVersion&gt;4.1.0&lt;/deprecationVersion&gt;&lt;rationale&gt;Change Request #25. Trim down Dangerous Goods Data Elements.
 *             Outcomes of ATMRPP/2 shows DG data element other than NOTOC items are not required 
 *             in FIXM Core.&lt;/rationale&gt;&lt;replacement&gt;N/A&lt;/replacement&gt;&lt;/deprecated&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DeclarationTextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclarationTextType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ExtensibleType">
 *       &lt;attribute name="compliance" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *       &lt;attribute name="consignor" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *       &lt;attribute name="shipper" type="{http://www.fixm.aero/base/4.1}CharacterStringType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeclarationTextType")
@Entity(name = "DeclarationTextType")
@Table(name = "DECLARATIONTEXTTYPE")
public class DeclarationTextType
    extends ExtensibleType
    implements Equals, HashCode
{

    @XmlAttribute(name = "compliance")
    protected String compliance;
    @XmlAttribute(name = "consignor")
    protected String consignor;
    @XmlAttribute(name = "shipper")
    protected String shipper;

    /**
     * Gets the value of the compliance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "COMPLIANCE", length = 4096)
    public String getCompliance() {
        return compliance;
    }

    /**
     * Sets the value of the compliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompliance(String value) {
        this.compliance = value;
    }

    /**
     * Gets the value of the consignor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "CONSIGNOR", length = 4096)
    public String getConsignor() {
        return consignor;
    }

    /**
     * Sets the value of the consignor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsignor(String value) {
        this.consignor = value;
    }

    /**
     * Gets the value of the shipper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "SHIPPER", length = 4096)
    public String getShipper() {
        return shipper;
    }

    /**
     * Sets the value of the shipper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipper(String value) {
        this.shipper = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DeclarationTextType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final DeclarationTextType that = ((DeclarationTextType) object);
        {
            String lhsCompliance;
            lhsCompliance = this.getCompliance();
            String rhsCompliance;
            rhsCompliance = that.getCompliance();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "compliance", lhsCompliance), LocatorUtils.property(thatLocator, "compliance", rhsCompliance), lhsCompliance, rhsCompliance)) {
                return false;
            }
        }
        {
            String lhsConsignor;
            lhsConsignor = this.getConsignor();
            String rhsConsignor;
            rhsConsignor = that.getConsignor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "consignor", lhsConsignor), LocatorUtils.property(thatLocator, "consignor", rhsConsignor), lhsConsignor, rhsConsignor)) {
                return false;
            }
        }
        {
            String lhsShipper;
            lhsShipper = this.getShipper();
            String rhsShipper;
            rhsShipper = that.getShipper();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "shipper", lhsShipper), LocatorUtils.property(thatLocator, "shipper", rhsShipper), lhsShipper, rhsShipper)) {
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
            String theCompliance;
            theCompliance = this.getCompliance();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "compliance", theCompliance), currentHashCode, theCompliance);
        }
        {
            String theConsignor;
            theConsignor = this.getConsignor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "consignor", theConsignor), currentHashCode, theConsignor);
        }
        {
            String theShipper;
            theShipper = this.getShipper();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "shipper", theShipper), currentHashCode, theShipper);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
