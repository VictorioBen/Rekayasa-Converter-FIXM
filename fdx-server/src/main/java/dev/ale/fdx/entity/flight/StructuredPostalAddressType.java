//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.flight;

import javax.persistence.Entity;
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

import dev.ale.fdx.entity.base.ContactInformationType;


/**
 * 
 *             The building number and Street Name portion of the Address. 
 *             The XML Grouping Element that contains the parts of a Postal Address broken into 
 *             its component parts (Structured). 
 *             he Post Office (PO) Box number portion of a structured postal address. 
 *             The ZIP/Postal Code corresponding to the street address. 
 *             The name of the city the package is being shipped to. 
 *             Contains the Department Name portion of the Address. 
 *             The name of the region within a country specific to this address. 
 *             A code that indicates a country. 
 *             The name of a country. 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;deprecated xmlns="http://www.w3.org/2001/XMLSchema" xmlns:fb="http://www.fixm.aero/base/4.1" xmlns:fx="http://www.fixm.aero/flight/4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;deletionVersion&gt;5.0.0&lt;/deletionVersion&gt;&lt;deprecationVersion&gt;4.1.0&lt;/deprecationVersion&gt;&lt;rationale&gt;Change Request #25. Outcomes of ATMRPP/2 shows DG data element other than NOTOC items are not required in FIXM Core.&lt;/rationale&gt;&lt;replacement&gt;N/A&lt;/replacement&gt;&lt;/deprecated&gt;
 * </pre>
 * 
 * 
 * <p>Java class for StructuredPostalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StructuredPostalAddressType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/base/4.1}ContactInformationType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StructuredPostalAddressType")
@Entity(name = "StructuredPostalAddressType")
@Table(name = "STRUCTUREDPOSTALADDRESSTYPE")
public class StructuredPostalAddressType
    extends ContactInformationType
    implements Equals, HashCode
{


    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof StructuredPostalAddressType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
