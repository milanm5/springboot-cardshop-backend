package com.pmf.uns.ac.rs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pmf.uns.ac.rs.model.MMCard;
import java.util.List;
import java.util.Optional;


public interface CardRepository extends JpaRepository<MMCard, Integer> {

	Optional<MMCard> findByCardName(String cardName);
}
