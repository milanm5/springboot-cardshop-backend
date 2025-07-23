package com.pmf.uns.ac.rs.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmf.uns.ac.rs.model.MMCart;
import com.pmf.uns.ac.rs.model.MMCustomer;
import com.pmf.uns.ac.rs.model.MMOrder;
import com.pmf.uns.ac.rs.service.OrderService;

@RestController
public class OrderControl {

	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("create-order")
	private MMOrder createOrder(@RequestBody MMOrder order) {
		return orderService.createOrder(order);
	}
	
	@PostMapping("find-cart-by-customer")
	private MMCart findCartByCustomer(@RequestBody MMCustomer customer) {
		return orderService.getCart(customer);
	}
 	
//	@GetMapping("get-orders-by-customer")
//	private List<MMOrder> getOrdersFromCustomer(@RequestBody MMCustomer customer) {
//		return orderService.getOrders(customer);
//	}
}
