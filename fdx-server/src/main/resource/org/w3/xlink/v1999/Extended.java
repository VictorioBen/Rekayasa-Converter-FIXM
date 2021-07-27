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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.hyperjaxb3.item.Item;
import org.jvnet.hyperjaxb3.item.ItemUtils;
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
 *     Intended for use as the type of user-declared elements to make them
 *     extended links.
 *     Note that the elements referenced in the content model are all abstract.
 *     The intention is that by simply declaring elements with these as their
 *     substitutionGroup, all the right things will happen.
 *    
 * 
 * <p>Java class for extended complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="extended">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{http://www.w3.org/1999/xlink}extendedModel" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;attGroup ref="{http://www.w3.org/1999/xlink}extendedAttrs"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "extended", propOrder = {
    "extendedModel"
})
@Entity(name = "Extended")
@Table(name = "EXTENDED")
@Inheritance(strategy = InheritanceType.JOINED)
public class Extended
    implements Equals, HashCode
{

    @XmlElements({
        @XmlElement(name = "title", type = TitleEltType.class),
        @XmlElement(name = "resource", type = ResourceType.class),
        @XmlElement(name = "locator", type = LocatorType.class),
        @XmlElement(name = "arc", type = ArcType.class)
    })
    protected List<Object> extendedModel;
    @XmlAttribute(name = "type", namespace = "http://www.w3.org/1999/xlink", required = true)
    protected TypeType type;
    @XmlAttribute(name = "role", namespace = "http://www.w3.org/1999/xlink")
    protected String role;
    @XmlAttribute(name = "title", namespace = "http://www.w3.org/1999/xlink")
    protected String titleAttribute;
    @XmlAttribute(name = "Hjid")
    protected Long hjid;
    protected transient List<Extended.ExtendedExtendedModelItem> extendedModelItems;

    /**
     * Gets the value of the extendedModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TitleEltType }
     * {@link ResourceType }
     * {@link LocatorType }
     * {@link ArcType }
     * 
     * 
     */
    @Transient
    public List<Object> getExtendedModel() {
        if (extendedModel == null) {
            extendedModel = new ArrayList<Object>();
        }
        return this.extendedModel;
    }

    /**
     * 
     * 
     */
    public void setExtendedModel(List<Object> extendedModel) {
        this.extendedModel = extendedModel;
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
            return TypeType.EXTENDED;
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

    @OneToMany(targetEntity = Extended.ExtendedExtendedModelItem.class, cascade = {
        CascadeType.ALL
    })
    @JoinColumn(name = "EXTENDEDMODELITEMS_EXTENDED__0")
    public List<Extended.ExtendedExtendedModelItem> getExtendedModelItems() {
        if (this.extendedModelItems == null) {
            this.extendedModelItems = new ArrayList<Extended.ExtendedExtendedModelItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.extendedModel)) {
            this.extendedModel = ItemUtils.wrap(this.extendedModel, this.extendedModelItems, Extended.ExtendedExtendedModelItem.class);
        }
        return this.extendedModelItems;
    }

    public void setExtendedModelItems(List<Extended.ExtendedExtendedModelItem> value) {
        this.extendedModel = null;
        this.extendedModelItems = null;
        this.extendedModelItems = value;
        if (this.extendedModelItems == null) {
            this.extendedModelItems = new ArrayList<Extended.ExtendedExtendedModelItem>();
        }
        if (ItemUtils.shouldBeWrapped(this.extendedModel)) {
            this.extendedModel = ItemUtils.wrap(this.extendedModel, this.extendedModelItems, Extended.ExtendedExtendedModelItem.class);
        }
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Extended)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Extended that = ((Extended) object);
        {
            List<Object> lhsExtendedModel;
            lhsExtendedModel = (((this.extendedModel!= null)&&(!this.extendedModel.isEmpty()))?this.getExtendedModel():null);
            List<Object> rhsExtendedModel;
            rhsExtendedModel = (((that.extendedModel!= null)&&(!that.extendedModel.isEmpty()))?that.getExtendedModel():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "extendedModel", lhsExtendedModel), LocatorUtils.property(thatLocator, "extendedModel", rhsExtendedModel), lhsExtendedModel, rhsExtendedModel)) {
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
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Object> theExtendedModel;
            theExtendedModel = (((this.extendedModel!= null)&&(!this.extendedModel.isEmpty()))?this.getExtendedModel():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "extendedModel", theExtendedModel), currentHashCode, theExtendedModel);
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
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @Entity(name = "Extended$ExtendedExtendedModelItem")
    @Table(name = "EXTENDEDEXTENDEDMODELITEM")
    @Inheritance(strategy = InheritanceType.JOINED)
    public static class ExtendedExtendedModelItem
        implements Item<Object>
    {

        @XmlElements({
            @XmlElement(name = "title", type = TitleEltType.class),
            @XmlElement(name = "resource", type = ResourceType.class),
            @XmlElement(name = "locator", type = LocatorType.class),
            @XmlElement(name = "arc", type = ArcType.class)
        })
        protected Object item;
        @XmlAttribute(name = "Hjid")
        protected Long hjid;

        /**
         * 
         * 
         * @return
         *     possible object is
         *     {@link TitleEltType }
         *     {@link ResourceType }
         *     {@link LocatorType }
         *     {@link ArcType }
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
         *     {@link TitleEltType }
         *     {@link ResourceType }
         *     {@link LocatorType }
         *     {@link ArcType }
         *     
         */
        public void setItem(Object value) {
            this.item = value;
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

        @ManyToOne(targetEntity = TitleEltType.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "ITEMTITLE_EXTENDEDEXTENDEDMO_0")
        public TitleEltType getItemTitle() {
            if (this.getItem() instanceof TitleEltType) {
                return ((TitleEltType) this.getItem());
            } else {
                return null;
            }
        }

        public void setItemTitle(TitleEltType target) {
            if (target!= null) {
                setItem(target);
            }
        }

        @ManyToOne(targetEntity = ResourceType.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "ITEMRESOURCE_EXTENDEDEXTENDE_0")
        public ResourceType getItemResource() {
            if (this.getItem() instanceof ResourceType) {
                return ((ResourceType) this.getItem());
            } else {
                return null;
            }
        }

        public void setItemResource(ResourceType target) {
            if (target!= null) {
                setItem(target);
            }
        }

        @ManyToOne(targetEntity = LocatorType.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "ITEMLOCATOR_EXTENDEDEXTENDED_0")
        public LocatorType getItemLocator() {
            if (this.getItem() instanceof LocatorType) {
                return ((LocatorType) this.getItem());
            } else {
                return null;
            }
        }

        public void setItemLocator(LocatorType target) {
            if (target!= null) {
                setItem(target);
            }
        }

        @ManyToOne(targetEntity = ArcType.class, cascade = {
            CascadeType.ALL
        })
        @JoinColumn(name = "ITEMARC_EXTENDEDEXTENDEDMODE_0")
        public ArcType getItemArc() {
            if (this.getItem() instanceof ArcType) {
                return ((ArcType) this.getItem());
            } else {
                return null;
            }
        }

        public void setItemArc(ArcType target) {
            if (target!= null) {
                setItem(target);
            }
        }

    }

}
