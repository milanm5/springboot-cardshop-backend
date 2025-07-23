package com.pmf.uns.ac.rs.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.uns.ac.rs.model.MMOrder;
import com.pmf.uns.ac.rs.model.MMCart;


public interface OrderRepository extends JpaRepository<MMOrder, Integer>{

	Optional<List<MMOrder>> findByMmcart(MMCart mmcart);
	
}
