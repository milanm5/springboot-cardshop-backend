package com.pmf.uns.ac.rs.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmf.uns.ac.rs.beans.MMCard;
import com.pmf.uns.ac.rs.beans.MMCart;
import com.pmf.uns.ac.rs.beans.MMCustomer;
import com.pmf.uns.ac.rs.beans.MMOrder;
import com.pmf.uns.ac.rs.proxy.CardProxy;
import com.pmf.uns.ac.rs.proxy.CustomerProxy;
import com.pmf.uns.ac.rs.proxy.OrderProxy;

@RestController
public class ShopControl {

	
	@Autowired
	OrderProxy orderProxy;
	
	@Autowired
	CustomerProxy customerProxy;
	
	@Autowired
	CardProxy cardProxy;
	
	@PostMapping("add-card-to-cart/customer/{username}/card/{cardName}/quantity/{quantity}")
	public MMOrder addCardToCart(@PathVariable String username,@PathVariable String cardName,@PathVariable int quantity) {
		
		MMCustomer customer = customerProxy.findCustomer(username);
		
		if (customer == null) {
			return null;
		}
		
		MMCard card = cardProxy.findCardByName(cardName);
		
		if (card == null) {
			return null;
		}
		
		MMCart cart = orderProxy.findCartByCustomer(customer);
		
		if (cart == null) {
			return null;
		}
		
		MMOrder order = new MMOrder();
		order.setCustomerId(customer.getCustomerId());
		order.setMmcard(card);
		order.setMmcart(cart);
		order.setOrderQuantity(quantity);
		order.setTotalPrice(quantity * card.getCardPrice());
		
		MMOrder addedOrder = orderProxy.createOrder(order);
		
		return addedOrder;
	}
}
