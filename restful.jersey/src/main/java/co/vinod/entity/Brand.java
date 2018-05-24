
package co.vinod.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "brands")
public class Brand {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	@XmlElement(required = true)
	protected String name;

	/**
	 * Gets the value of the id property.
	 * 
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 */
	public void setId(int value) {
		this.id = value;
	}

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

}
