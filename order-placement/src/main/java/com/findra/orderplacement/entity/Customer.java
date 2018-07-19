package com.findra.orderplacement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "CUSTOMER")
public class Customer extends AbstractEntity {

	private static final long serialVersionUID = 7717508141570848552L;

	// TODO: ADD VALIDATIONS FOR ALL FIELD

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "OTHER_NAME")
	private String otherName;

	@Column(name = "ADDRESS")
	private String address; // should be replaced with address entity, embeddable is an option

	@Column(name = "PHONE")
	private String phone;

	@Email
	@Column(name = "EMAIL")
	private String email;

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getOtherName() {
		return otherName;
	}

	public void setOtherName(String otherName) {
		this.otherName = otherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
