package com.pmf.uns.ac.rs.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the MMCustomer database table.
 * 
 */
@Entity
@NamedQuery(name="MMCustomer.findAll", query="SELECT m FROM MMCustomer m")
public class MMCustomer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;

	private String customerAddress;

	private String customerName;

	private String customerUsername;

	//bi-directional many-to-one association to MMCart
	@OneToMany(mappedBy="mmcustomer")
	
	private List<MMCart> mmcarts;

	public MMCustomer() {
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddress() {
		return this.customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerUsername() {
		return this.customerUsername;
	}

	public void setCustomerUsername(String customerUsername) {
		this.customerUsername = customerUsername;
	}

	public List<MMCart> getMmcarts() {
		return this.mmcarts;
	}

	public void setMmcarts(List<MMCart> mmcarts) {
		this.mmcarts = mmcarts;
	}

	public MMCart addMmcart(MMCart mmcart) {
		getMmcarts().add(mmcart);
		mmcart.setMmcustomer(this);

		return mmcart;
	}

	public MMCart removeMmcart(MMCart mmcart) {
		getMmcarts().remove(mmcart);
		mmcart.setMmcustomer(null);

		return mmcart;
	}

}