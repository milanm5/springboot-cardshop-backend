package com.pmf.uns.ac.rs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmf.uns.ac.rs.model.MMCard;
import com.pmf.uns.ac.rs.model.MMCardSet;
import com.pmf.uns.ac.rs.repository.CardRepository;
import com.pmf.uns.ac.rs.repository.SetRepository;

@Service
public class CardService {

	@Autowired
	private CardRepository cardRepo;
	
	@Autowired
	private SetRepository setRepo;
	
	public List<MMCard> allCards() {
		return cardRepo.findAll();
	}
	
	public List<MMCardSet> allSets() {
		return setRepo.findAll();
	}
	
	public MMCard findCardByName(String cName) {
		
		Optional<MMCard> card = cardRepo.findByCardName(cName);
		
		if (card.isEmpty()) {
			return null;
		}
		
		return card.get();
	}
	
	public MMCardSet findSetByCode(String setCode) {
		
		Optional<MMCardSet> set = setRepo.findBySetCode(setCode);
		
		if (set.isEmpty()) {
			return null;
		}
		
		return set.get();
	}
	
	public MMCard addCard(MMCard card) {
		
		Optional<MMCard> c = cardRepo.findByCardName(card.getCardName());
		
		if (c.isEmpty()) {
			MMCard addedCard = cardRepo.save(card);
			
			return addedCard;
		}
		
		c.get().setCardQuantity(c.get().getCardQuantity() + card.getCardQuantity());
		
		return cardRepo.save(c.get());
	}
	
	public MMCardSet addSet(MMCardSet setToAdd) {
		
		Optional<MMCardSet> set = setRepo.findBySetCode(setToAdd.getSetCode());
		
		if (set.isEmpty()) {
			return setRepo.save(setToAdd);
		}
		
		return set.get();
	}
}
