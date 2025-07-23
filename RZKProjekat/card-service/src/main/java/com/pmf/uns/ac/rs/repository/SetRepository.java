package com.pmf.uns.ac.rs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.uns.ac.rs.model.MMCardSet;
import java.util.List;
import java.util.Optional;


public interface SetRepository extends JpaRepository<MMCardSet, Integer>{
	
	Optional<MMCardSet> findBySetCode(String code);

	
}
