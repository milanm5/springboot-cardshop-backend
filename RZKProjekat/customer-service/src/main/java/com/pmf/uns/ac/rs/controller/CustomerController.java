package com.pmf.uns.ac.rs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmf.uns.ac.rs.model.MMCustomer;
import com.pmf.uns.ac.rs.service.CustomerService;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/add-customer")
	public List<MMCustomer> addCustomer(@RequestBody MMCustomer customer) {
		return customerService.addCustomer(customer);
	}
	
	@GetMapping("/all-customers")
	public List<MMCustomer> allCustomers() {
		return customerService.returnAllCustomers();
	}
	
	@GetMapping("/find-customer/{username}")
	public MMCustomer findCustomer(@PathVariable String username) {
		return customerService.findCustomerByUsername(username);
	}
}
