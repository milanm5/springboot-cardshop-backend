package com.pmf.uns.ac.rs.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.pmf.uns.ac.rs.beans.MMOrder;
import com.pmf.uns.ac.rs.beans.MMCart;
import com.pmf.uns.ac.rs.beans.MMCustomer;

@FeignClient(name = "order-service")
public interface OrderProxy {

	@PostMapping("create-order")
	public MMOrder createOrder(@RequestBody MMOrder order);
	
	@PostMapping("find-cart-by-customer")
	public MMCart findCartByCustomer(@RequestBody MMCustomer customer);
}
