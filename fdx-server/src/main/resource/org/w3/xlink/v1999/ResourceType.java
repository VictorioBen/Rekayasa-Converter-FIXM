//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.10.28 at 02:58:02 PM ICT 
//


package org.w3.xlink.v1999;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.hyperjaxb3.item.MixedItem;
import org.jvnet.hyperjaxb3.item.MixedItemUtils;
import org.jvnet.hyperjaxb3.xml.bind.JAXBContextUtils;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.ElementAsString;
import org.jvnet.hyperjaxb3.xml.bind.annotation.adapters.XmlAdapterUtils;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;
import org.w3c.dom.Element;


/**
 * <p>Java class for resourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1999/xlink}resourceModel"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}resourceAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resourceType", propOrder = {
    "content"
})
@Entity(name = "ResourceType")
@Table(name = "RESOURCETYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class ResourceType implements Equals, HashCode
{

    @XmlMixed
    @XmlAnyElement(lax = true)
    protected List<Object> content;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
    protected TypeType type;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String titleAttribute;
    @XmlAttribute(name = "label", namespace = "http://www.w3.org/1999/xlink")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String label;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<ResourceType.ResourceTypeContentItem> contentItems;

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link String }
     * {@link Object }
     * 
     * 
     */
    @Transient
    public List<Object> getContent() {
        if (content == null) {
            content = new ArrayList<Object>();
        }
        return this.content;
    }

    /**
     * 
     * 
     */
    public void setContent(List<Object> content) {
        this.content = content;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeType }
     *     
     */
    @Basic
    @Column(name = "TYPE_", length = 255)
    @Enumerated(EnumType.STRING)
    public TypeType getType() {
        if (type == null) {
            return TypeType.RESOURCE;
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeType }
     *     
     */
    public void setType(TypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "ROLE_")
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the titleAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "TITLEATTRIBUTE", length = 255)
    public String getTitleAttribute() {
        return titleAttribute;
    }

    /**
     * Sets the value of the titleAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAttribute(String value) {
        this.titleAttribute = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Basic
    @Column(name = "LABEL", length = 255)
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the hjid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    @Id
    @Column(name = "HJID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getHjid() {
        return hjid;
    }

    /**
     * Sets the value of the hjid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setHjid(Long value) {
        this.hjid = value;
    }

    @OneToMany(targetEntity = ResourceType.ResourceTypeContentItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "CONTENTITEMS_RESOURCETYPE_HJ_0")
    public List<ResourceType.ResourceTypeContentItem> getContentItems() {
        if (this.contentItems == null) {
            this.contentItems = new ArrayList<ResourceType.ResourceTypeContentItem>();
        }
        if (MixedItemUtils.shouldBeWrapped(this.content)) {
            this.content = MixedItemUtils.wrap(this.content, this.contentItems, ResourceType.ResourceTypeContentItem.class);
        }
        return this.contentItems;
    }

    public void setContentItems(List<ResourceType.ResourceTypeContentItem> value) {
        this.content = null;
        this.contentItems = null;
        this.contentItems = value;
        if (this.contentItems == null) {
            this.contentItems = new ArrayList<ResourceType.ResourceTypeContentItem>();
        }
        if (MixedItemUtils.shouldBeWrapped(this.content)) {
            this.content = MixedItemUtils.wrap(this.content, this.contentItems, ResourceType.ResourceTypeContentItem.class);
        }
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ResourceType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResourceType that = ((ResourceType) object);
        {
            List<Object> lhsContent;
            lhsContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            List<Object> rhsContent;
            rhsContent = (((that.content!= null)&&(!that.content.isEmpty()))?that.getContent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
                return false;
            }
        }
        {
            TypeType lhsType;
            lhsType = this.getType();
            TypeType rhsType;
            rhsType = that.getType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "type", lhsType), LocatorUtils.property(thatLocator, "type", rhsType), lhsType, rhsType)) {
                return false;
            }
        }
        {
            String lhsRole;
            lhsRole = this.getRole();
            String rhsRole;
            rhsRole = that.getRole();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole)) {
                return false;
            }
        }
        {
            String lhsTitleAttribute;
            lhsTitleAttribute = this.getTitleAttribute();
            String rhsTitleAttribute;
            rhsTitleAttribute = that.getTitleAttribute();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "titleAttribute", lhsTitleAttribute), LocatorUtils.property(thatLocator, "titleAttribute", rhsTitleAttribute), lhsTitleAttribute, rhsTitleAttribute)) {
                return false;
            }
        }
        {
            String lhsLabel;
            lhsLabel = this.getLabel();
            String rhsLabel;
            rhsLabel = that.getLabel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "label", lhsLabel), LocatorUtils.property(thatLocator, "label", rhsLabel), lhsLabel, rhsLabel)) {
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
        int currentHashCode = 1;
        {
            List<Object> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
        }
        {
            TypeType theType;
            theType = this.getType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "type", theType), currentHashCode, theType);
        }
        {
            String theRole;
            theRole = this.getRole();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole);
        }
        {
            String theTitleAttribute;
            theTitleAttribute = this.getTitleAttribute();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "titleAttribute", theTitleAttribute), currentHashCode, theTitleAttribute);
        }
        {
            String theLabel;
            theLabel = this.getLabel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "label", theLabel), currentHashCode, theLabel);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "ResourceType$ResourceTypeContentItem")
    @Table(name = "RESOURCETYPECONTENTITEM")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class ResourceTypeContentItem
        implements MixedItem<Object>
    {

        @XmlAnyElement(lax = true)
        protected Object item;
        @XmlAttribute(name = "Text")
        protected String text;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;
        public final static String ItemObjectContextPath = "aero.fixm.base._4:aero.fixm.flight._4:aero.fixm.messaging._4:org.w3.xlink.v1999";

        /**
         * 
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        @Transient
        public Object getItem() {
            return item;
        }

        /**
         * 
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setItem(Object value) {
            this.item = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Basic
        @Column(name = "TEXT")
        @Lob
        public String getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setText(String value) {
            this.text = value;
        }

        /**
         * Gets the value of the hjid property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        @Id
        @Column(name = "HJID")
        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long getHjid() {
            return hjid;
        }

        /**
         * Sets the value of the hjid property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setHjid(Long value) {
            this.hjid = value;
        }

        @Basic
        @Column(name = "ITEMELEMENT")
        @Lob
        public String getItemElement() {
            if (this.getItem() instanceof Element) {
                return XmlAdapterUtils.unmarshall(ElementAsString.class, ((Element) this.getItem()));
            } else {
                return null;
            }
        }

        public void setItemElement(String target) {
            if (target!= null) {
                setItem(XmlAdapterUtils.marshall(ElementAsString.class, target));
            }
        }

        @Basic
        @Column(name = "ITEMOBJECT")
        @Lob
        public String getItemObject() {
            if (JAXBContextUtils.isElement(ItemObjectContextPath, this.getItem())) {
                return JAXBContextUtils.marshal(ItemObjectContextPath, this.getItem());
            } else {
                return null;
            }
        }

        public void setItemObject(String target) {
            if (target!= null) {
                setItem(JAXBContextUtils.unmarshal(ItemObjectContextPath, target));
            }
        }

    }

}
