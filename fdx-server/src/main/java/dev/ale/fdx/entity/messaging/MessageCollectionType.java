//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.messaging;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
import org.springframework.context.annotation.Lazy;


/**
 * 
 *             A structure allowing multiple messages to be sent together. [FIXM] The MessageCollection 
 *             element is an entry point to the FIXM model. 
 *             
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;deprecated xmlns="http://www.w3.org/2001/XMLSchema" xmlns:fb="http://www.fixm.aero/base/4.1" xmlns:fx="http://www.fixm.aero/flight/4.1" xmlns:mesg="http://www.fixm.aero/messaging/4.1" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;&lt;deletionVersion&gt;Not Specified yet&lt;/deletionVersion&gt;&lt;deprecationVersion&gt;4.1.0&lt;/deprecationVersion&gt;&lt;rationale&gt;CR 28&lt;/rationale&gt;&lt;/deprecated&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MessageCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.fixm.aero/messaging/4.1}AbstractMessageType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://www.fixm.aero/messaging/4.1}AbstractMessageType" maxOccurs="2000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageCollectionType", propOrder = {
    "message"
})
@Entity(name = "MessageCollectionType")
@Table(name = "MESSAGECOLLECTIONTYPE")
public class MessageCollectionType
    extends AbstractMessageType
    implements Equals, HashCode
{

    protected List<AbstractMessageType> message;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractMessageType }
     * 
     * 
     */
    @OneToMany(targetEntity = AbstractMessageType.class, cascade = {
        CascadeType.ALL
    },fetch = FetchType.LAZY)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "MESSAGE_MESSAGECOLLECTIONTYP_0")
    public List<AbstractMessageType> getMessage() {
        if (message == null) {
            message = new ArrayList<AbstractMessageType>();
        }
        return this.message;
    }

    /**
     * 
     * 
     */
    public void setMessage(List<AbstractMessageType> message) {
        this.message = message;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof MessageCollectionType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final MessageCollectionType that = ((MessageCollectionType) object);
        {
            List<AbstractMessageType> lhsMessage;
            lhsMessage = (((this.message!= null)&&(!this.message.isEmpty()))?this.getMessage():null);
            List<AbstractMessageType> rhsMessage;
            rhsMessage = (((that.message!= null)&&(!that.message.isEmpty()))?that.getMessage():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
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
            List<AbstractMessageType> theMessage;
            theMessage = (((this.message!= null)&&(!this.message.isEmpty()))?this.getMessage():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
