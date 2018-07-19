package com.findra.orderplacement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Inventory extends AbstractEntity {

	private static final long serialVersionUID = -1729727176188731686L;

	@Column(name = "QUANTITY")
	private Integer quantity;

	@OneToOne 							// one to one with product, do we sub division?
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
