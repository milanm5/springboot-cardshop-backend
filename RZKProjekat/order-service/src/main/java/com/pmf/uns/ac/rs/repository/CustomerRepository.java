package com.pmf.uns.ac.rs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.uns.ac.rs.model.MMCustomer;


public interface CustomerRepository extends JpaRepository<MMCustomer, Integer>{

	Optional<MMCustomer> findByCustomerUsername(String customerUsername);
}
