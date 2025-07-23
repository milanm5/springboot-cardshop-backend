package com.pmf.uns.ac.rs.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pmf.uns.ac.rs.beans.MMCustomer;

@FeignClient(name="customer-service")
public interface CustomerProxy {

	@GetMapping("/find-customer/{username}")
	public MMCustomer findCustomer(@PathVariable String username);
}
