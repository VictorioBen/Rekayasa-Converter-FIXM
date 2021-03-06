//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package dev.ale.fdx.entity.messaging;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.fixm.messaging._4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PlanningStatus_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "PlanningStatus");
    private final static QName _FilingStatus_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "FilingStatus");
    private final static QName _FlightPlanVersion_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "FlightPlanVersion");
    private final static QName _FlightPlanVersionTypeChoice_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "FlightPlanVersionTypeChoice");
    private final static QName _Message_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "Message");
    private final static QName _SubmissionStatus_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "SubmissionStatus");
    private final static QName _MessageCollection_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "MessageCollection");
    private final static QName _AbstractMessage_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "AbstractMessage");
    private final static QName _FlightPlanNegotiationStatus_QNAME = new QName("http://www.fixm.aero/messaging/4.1", "FlightPlanNegotiationStatus");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.fixm.messaging._4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SubmissionStatusType }
     * 
     */
    public SubmissionStatusType createSubmissionStatusType() {
        return new SubmissionStatusType();
    }

    /**
     * Create an instance of {@link MessageCollectionType }
     * 
     */
    public MessageCollectionType createMessageCollectionType() {
        return new MessageCollectionType();
    }

    /**
     * Create an instance of {@link FlightPlanNegotiationStatusType }
     * 
     */
    public FlightPlanNegotiationStatusType createFlightPlanNegotiationStatusType() {
        return new FlightPlanNegotiationStatusType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link FilingStatusType }
     * 
     */
    public FilingStatusType createFilingStatusType() {
        return new FilingStatusType();
    }

    /**
     * Create an instance of {@link FlightPlanVersionTypeChoiceType }
     * 
     */
    public FlightPlanVersionTypeChoiceType createFlightPlanVersionTypeChoiceType() {
        return new FlightPlanVersionTypeChoiceType();
    }

    /**
     * Create an instance of {@link FlightPlanVersionType }
     * 
     */
    public FlightPlanVersionType createFlightPlanVersionType() {
        return new FlightPlanVersionType();
    }

    /**
     * Create an instance of {@link PlanningStatusType }
     * 
     */
    public PlanningStatusType createPlanningStatusType() {
        return new PlanningStatusType();
    }

    /**
     * Create an instance of {@link FIXMUniqueMessageIdentifierType }
     * 
     */
    public FIXMUniqueMessageIdentifierType createFIXMUniqueMessageIdentifierType() {
        return new FIXMUniqueMessageIdentifierType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlanningStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "PlanningStatus", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<PlanningStatusType> createPlanningStatus(PlanningStatusType value) {
        return new JAXBElement<PlanningStatusType>(_PlanningStatus_QNAME, PlanningStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FilingStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "FilingStatus", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<FilingStatusType> createFilingStatus(FilingStatusType value) {
        return new JAXBElement<FilingStatusType>(_FilingStatus_QNAME, FilingStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPlanVersionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "FlightPlanVersion", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<FlightPlanVersionType> createFlightPlanVersion(FlightPlanVersionType value) {
        return new JAXBElement<FlightPlanVersionType>(_FlightPlanVersion_QNAME, FlightPlanVersionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPlanVersionTypeChoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "FlightPlanVersionTypeChoice", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<FlightPlanVersionTypeChoiceType> createFlightPlanVersionTypeChoice(FlightPlanVersionTypeChoiceType value) {
        return new JAXBElement<FlightPlanVersionTypeChoiceType>(_FlightPlanVersionTypeChoice_QNAME, FlightPlanVersionTypeChoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "Message", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<MessageType> createMessage(MessageType value) {
        return new JAXBElement<MessageType>(_Message_QNAME, MessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmissionStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "SubmissionStatus", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<SubmissionStatusType> createSubmissionStatus(SubmissionStatusType value) {
        return new JAXBElement<SubmissionStatusType>(_SubmissionStatus_QNAME, SubmissionStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MessageCollectionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "MessageCollection", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<MessageCollectionType> createMessageCollection(MessageCollectionType value) {
        return new JAXBElement<MessageCollectionType>(_MessageCollection_QNAME, MessageCollectionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AbstractMessageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "AbstractMessage", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<AbstractMessageType> createAbstractMessage(AbstractMessageType value) {
        return new JAXBElement<AbstractMessageType>(_AbstractMessage_QNAME, AbstractMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPlanNegotiationStatusType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.fixm.aero/messaging/4.1", name = "FlightPlanNegotiationStatus", substitutionHeadNamespace = "http://www.fixm.aero/base/4.1", substitutionHeadName = "Extensible")
    public JAXBElement<FlightPlanNegotiationStatusType> createFlightPlanNegotiationStatus(FlightPlanNegotiationStatusType value) {
        return new JAXBElement<FlightPlanNegotiationStatusType>(_FlightPlanNegotiationStatus_QNAME, FlightPlanNegotiationStatusType.class, null, value);
    }

}
