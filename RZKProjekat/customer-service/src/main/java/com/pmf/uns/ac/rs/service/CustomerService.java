package com.pmf.uns.ac.rs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmf.uns.ac.rs.model.MMCustomer;
import com.pmf.uns.ac.rs.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	
	public List<MMCustomer> returnAllCustomers() {
		return repo.findAll();
	}
	
	public List<MMCustomer> addCustomer(MMCustomer customer) {
		Optional<MMCustomer> existingCust = repo.findByCustomerUsername(customer.getCustomerUsername());
		if (existingCust.isPresent()) {
			return null;
		}
		repo.save(customer);
		return repo.findAll();
	}
	
	public MMCustomer findCustomer(int custId) {
		Optional<MMCustomer> customer = repo.findById(custId);
		
		if (customer.isEmpty()) {
			return null;
		}
		
		return customer.get();
	}
	
	public MMCustomer findCustomerByUsername(String username) {
		Optional<MMCustomer> customer = repo.findByCustomerUsername(username);
	
		if (customer.isEmpty()) {
			return null;
		}
		
		return customer.get();
	}
}
