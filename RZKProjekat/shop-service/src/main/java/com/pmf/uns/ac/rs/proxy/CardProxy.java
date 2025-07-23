package com.pmf.uns.ac.rs.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pmf.uns.ac.rs.beans.MMCard;

@FeignClient(name="card-service")
public interface CardProxy {

	@GetMapping("find-card-by-name/{cardName}")
	public MMCard findCardByName(@PathVariable String cardName);
}
