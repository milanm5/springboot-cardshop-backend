package com.pmf.uns.ac.rs.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class MMCart {
	
	private int cartId;

	@JsonIgnore
	private MMCustomer mmcustomer;
	@JsonIgnore
	private List<MMOrder> mmorders;
	
	public MMCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MMCart(int cartId, MMCustomer mmcustomer, List<MMOrder> mmorders) {
		super();
		this.cartId = cartId;
		this.mmcustomer = mmcustomer;
		this.mmorders = mmorders;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public MMCustomer getMmcustomer() {
		return mmcustomer;
	}

	public void setMmcustomer(MMCustomer mmcustomer) {
		this.mmcustomer = mmcustomer;
	}

	public List<MMOrder> getMmorders() {
		return mmorders;
	}

	public void setMmorders(List<MMOrder> mmorders) {
		this.mmorders = mmorders;
	}
	
	
}
