
package co.vinod.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
@Entity
@Table(name = "products")
public class Product {

	@XmlElement(required = true)
	protected String name;
	@XmlElement(required = true)
	protected String description;
	@XmlElement(name = "quantity-per-unit", required = true)
	@Column(name = "quantity_per_unit")
	protected String quantityPerUnit;
	@XmlElement(name = "unit-price")
	@Column(name = "unit_price")
	protected double unitPrice;
	protected double discount;
	@XmlElement(required = true)
	protected String picture;
	@XmlElement(required = true)
	@ManyToOne
	@JoinColumn(name = "brand_id")
	protected Brand brand;

	@XmlElement(required = true)
	@ManyToOne
	@JoinColumn(name = "category_id")
	protected Category category;
	@XmlAttribute(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;

	/**
	 * Gets the value of the name property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the name property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setName(String value) {
		this.name = value;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Gets the value of the quantityPerUnit property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	/**
	 * Sets the value of the quantityPerUnit property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setQuantityPerUnit(String value) {
		this.quantityPerUnit = value;
	}

	/**
	 * Gets the value of the unitPrice property.
	 * 
	 */
	public double getUnitPrice() {
		return unitPrice;
	}

	/**
	 * Sets the value of the unitPrice property.
	 * 
	 */
	public void setUnitPrice(double value) {
		this.unitPrice = value;
	}

	/**
	 * Gets the value of the discount property.
	 * 
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * Sets the value of the discount property.
	 * 
	 */
	public void setDiscount(double value) {
		this.discount = value;
	}

	/**
	 * Gets the value of the picture property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * Sets the value of the picture property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPicture(String value) {
		this.picture = value;
	}

	/**
	 * Gets the value of the brand property.
	 * 
	 * @return possible object is {@link Brand }
	 * 
	 */
	public Brand getBrand() {
		return brand;
	}

	/**
	 * Sets the value of the brand property.
	 * 
	 * @param value
	 *            allowed object is {@link Brand }
	 * 
	 */
	public void setBrand(Brand value) {
		this.brand = value;
	}

	/**
	 * Gets the value of the category property.
	 * 
	 * @return possible object is {@link Category }
	 * 
	 */
	public Category getCategory() {
		return category;
	}

	/**
	 * Sets the value of the category property.
	 * 
	 * @param value
	 *            allowed object is {@link Category }
	 * 
	 */
	public void setCategory(Category value) {
		this.category = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

}
