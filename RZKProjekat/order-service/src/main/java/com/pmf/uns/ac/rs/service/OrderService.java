package com.pmf.uns.ac.rs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmf.uns.ac.rs.model.MMCart;
import com.pmf.uns.ac.rs.model.MMCustomer;
import com.pmf.uns.ac.rs.model.MMOrder;
import com.pmf.uns.ac.rs.repository.CartRepository;
import com.pmf.uns.ac.rs.repository.CustomerRepository;
import com.pmf.uns.ac.rs.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepo;
	
	@Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	private CartRepository cartRepo;
	
	public MMOrder createOrder(MMOrder order) {
		MMOrder addedOrder = orderRepo.save(order);
		if (addedOrder == null) {
			return null;
		}
		return addedOrder;
	}
	
	public MMCart getCart(MMCustomer customer) {
		Optional<List<MMCart>> cart = cartRepo.findByMmcustomer(customer);
		
		if (cart.isEmpty()) {
			return null;
		}
		
		return cart.get().get(0);
	}
	
//	public List<MMOrder> getOrders(MMCustomer customer) {
//		
//		Optional<List<MMCart>> cart = cartRepo.findByMmcustomer(customer);
//		
//		if (cart.isEmpty()) {
//			return null;
//		}
//		
//		Optional<List<MMOrder>> orders = orderRepo.findByMmcart(cart.get().get(0));
//		
//		if (orders.isEmpty()) {
//			return null;
//		}
//		
//		return orders.get();
//	}
}
