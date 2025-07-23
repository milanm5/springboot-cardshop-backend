package com.pmf.uns.ac.rs.beans;

public class MMCustomer {
	
	private int customerId;
	
	private String customerAddress;

	private String customerName;

	private String customerUsername;
	
	public MMCustomer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MMCustomer(int customerId ,String customerAddress, String customerName, String customerUsername) {
		super();
		this.customerId = customerId;
		this.customerAddress = customerAddress;
		this.customerName = customerName;
		this.customerUsername = customerUsername;
	}
	
	

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	
	
}
