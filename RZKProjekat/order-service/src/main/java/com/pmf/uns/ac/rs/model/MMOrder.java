package com.pmf.uns.ac.rs.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;


/**
 * The persistent class for the MMOrder database table.
 * 
 */
@Entity
@NamedQuery(name="MMOrder.findAll", query="SELECT m FROM MMOrder m")
public class MMOrder implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;

	private int customerId;

	private int orderQuantity;

	private double totalPrice;

	//bi-directional many-to-one association to MMCard
	@ManyToOne
	@JoinColumn(name="cardId")
	private MMCard mmcard;

	//bi-directional many-to-one association to MMCart
	@ManyToOne
	@JoinColumn(name="cartId")
	private MMCart mmcart;

	public MMOrder() {
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderQuantity() {
		return this.orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getTotalPrice() {
		return this.totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public MMCard getMmcard() {
		return this.mmcard;
	}

	public void setMmcard(MMCard mmcard) {
		this.mmcard = mmcard;
	}

	public MMCart getMmcart() {
		return this.mmcart;
	}

	public void setMmcart(MMCart mmcart) {
		this.mmcart = mmcart;
	}

}