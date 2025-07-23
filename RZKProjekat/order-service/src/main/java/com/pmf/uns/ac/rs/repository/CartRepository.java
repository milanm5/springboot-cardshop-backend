package com.pmf.uns.ac.rs.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.uns.ac.rs.model.MMCart;
import com.pmf.uns.ac.rs.model.MMCustomer;


public interface CartRepository extends JpaRepository<MMCart, Integer>{

	Optional<List<MMCart>> findByMmcustomer(MMCustomer mmcustomer);;
}
