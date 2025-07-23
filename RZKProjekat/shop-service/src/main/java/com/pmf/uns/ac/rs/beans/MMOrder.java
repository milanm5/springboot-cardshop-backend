package com.pmf.uns.ac.rs.beans;

public class MMOrder {
	
	private int customerId;

	private int orderQuantity;

	private double totalPrice;

	private MMCard mmcard;

	private MMCart mmcart;
	
	

	public MMOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MMOrder(int customerId, int orderQuantity, double totalPrice, MMCard mmcard, MMCart mmcart) {
		super();
		this.customerId = customerId;
		this.orderQuantity = orderQuantity;
		this.totalPrice = totalPrice;
		this.mmcard = mmcard;
		this.mmcart = mmcart;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public MMCard getMmcard() {
		return mmcard;
	}

	public void setMmcard(MMCard mmcard) {
		this.mmcard = mmcard;
	}

	public MMCart getMmcart() {
		return mmcart;
	}

	public void setMmcart(MMCart mmcart) {
		this.mmcart = mmcart;
	}

	
	
}
