package com.findra.orderplacement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product extends AbstractEntity {

	private static final long serialVersionUID = 4081404848122110389L;

	@Column(name = "UPC")
	private String upc;

	@Column(name = "CATEGORY")
	private String category; 			// should be separate entity

	@Column(name = "NAME")
	private String name;

	@Column(name = "PRICE")
	private Float price;

	public String getUpc() {
		return upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

}
