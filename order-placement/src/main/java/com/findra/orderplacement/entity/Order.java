package com.findra.orderplacement.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER")
public class Order extends AbstractEntity {
	// TODO: unidirectional is fine?

	private static final long serialVersionUID = 1313600353322142918L;

	@Column(name = "PAYMENT_INFO")
	private String paymentInfo; // separate payment entity must be created

	@ManyToOne // should be many-to-many
	@JoinColumn(name = "PRODUCT_ID")
	private Product product;

	@Column(name = "QUANTITY")
	private Integer quantity; // should be updated as the relationship is changing many-to-many

	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;

	@Column(name = "ORDER_DATE")
	private LocalDateTime orderDate;

	@Column(name = "SHIPPING_ADDRESS")
	private String shippingAddress; // separate shipping address entity should be created

	public String getPaymentInfo() {
		return paymentInfo;
	}

	public void setPaymentInfo(String paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

}
