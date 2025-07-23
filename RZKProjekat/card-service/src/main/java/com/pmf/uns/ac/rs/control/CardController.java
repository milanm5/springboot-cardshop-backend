package com.pmf.uns.ac.rs.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmf.uns.ac.rs.model.MMCard;
import com.pmf.uns.ac.rs.model.MMCardSet;
import com.pmf.uns.ac.rs.service.CardService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;


@RestController
public class CardController {

	@Autowired
	private CardService cardService;
	
	@GetMapping("all-cards")
	private List<MMCard> allCards() {
		return cardService.allCards();
	}
	
	@GetMapping("find-card-by-name/{cardName}")
	private MMCard findCardByName(@PathVariable String cardName) {
		return cardService.findCardByName(cardName);
	}
	
	@GetMapping("all-sets")
	private List<MMCardSet> allSets() {
		return cardService.allSets();
	}
	
	@GetMapping("find-set/{setCode}")
	private MMCardSet findSetByCode(@PathVariable @Valid @Size(min = 3, max=3, message = "Set code is 3 letters long") String setCode) {
		return cardService.findSetByCode(setCode);
	}
	
	@PostMapping("add-card")
	private MMCard addOrUpdateCard(@RequestBody @Valid MMCard card) {
		return cardService.addCard(card);
	}

	@PostMapping("add-set")
	private MMCardSet addSet(@RequestBody @Valid MMCardSet set) {
		return cardService.addSet(set);
	}
}
