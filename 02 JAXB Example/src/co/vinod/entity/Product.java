package co.vinod.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Product {
	@XmlAttribute
	private Integer id;
	private String name;
	private String description;
	@XmlElement(name = "quantity-per-unit")
	private String quantityPerUnit;
	@XmlElement(name = "unit-price")
	private Double unitPrice;
	private Double discount;
	private String picture;

	private Brand brand;

	private Category category;

	public Product() {
	}

	// readable property called "authorName"
	public String getAuthorName() {
		return "Vinod Kumar";
	}

	public void setAuthorName(String authorName) {

	}

	// accessor; readable property "id"
	public Integer getId() {
		return id;
	}

	// mutator; writable property "id"
	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
