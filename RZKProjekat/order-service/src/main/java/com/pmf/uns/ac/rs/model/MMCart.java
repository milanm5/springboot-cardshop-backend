package com.pmf.uns.ac.rs.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the MMCart database table.
 * 
 */
@Entity
@NamedQuery(name="MMCart.findAll", query="SELECT m FROM MMCart m")
public class MMCart implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartId;

	//bi-directional many-to-one association to MMCustomer
	@ManyToOne()
	@JoinColumn(name="customerId")
	@JsonIgnore
	private MMCustomer mmcustomer;

	//bi-directional many-to-one association to MMOrder
	@OneToMany(mappedBy="mmcart")
	@JsonIgnore
	private List<MMOrder> mmorders;

	public MMCart() {
	}

	public int getCartId() {
		return this.cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public MMCustomer getMmcustomer() {
		return this.mmcustomer;
	}

	public void setMmcustomer(MMCustomer mmcustomer) {
		this.mmcustomer = mmcustomer;
	}

	public List<MMOrder> getMmorders() {
		return this.mmorders;
	}

	public void setMmorders(List<MMOrder> mmorders) {
		this.mmorders = mmorders;
	}

	public MMOrder addMmorder(MMOrder mmorder) {
		getMmorders().add(mmorder);
		mmorder.setMmcart(this);

		return mmorder;
	}

	public MMOrder removeMmorder(MMOrder mmorder) {
		getMmorders().remove(mmorder);
		mmorder.setMmcart(null);

		return mmorder;
	}

}