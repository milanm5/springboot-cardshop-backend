package com.pmf.uns.ac.rs.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the MMCardSet database table.
 * 
 */
@Entity
@NamedQuery(name="MMCardSet.findAll", query="SELECT m FROM MMCardSet m")
public class MMCardSet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cardSetId;

	@Min(1)
	private int numOfCards;

	@Size(min = 3, max = 3)
	private String setCode;

	@NotBlank
	private String setName;

	//bi-directional many-to-one association to MMCard
	@OneToMany(mappedBy="mmcardSet")
	@JsonIgnore
	private List<MMCard> mmcards;

	public MMCardSet() {
	}

	public int getCardSetId() {
		return this.cardSetId;
	}

	public void setCardSetId(int cardSetId) {
		this.cardSetId = cardSetId;
	}

	public int getNumOfCards() {
		return this.numOfCards;
	}

	public void setNumOfCards(int numOfCards) {
		this.numOfCards = numOfCards;
	}

	public String getSetCode() {
		return this.setCode;
	}

	public void setSetCode(String setCode) {
		this.setCode = setCode;
	}

	public String getSetName() {
		return this.setName;
	}

	public void setSetName(String setName) {
		this.setName = setName;
	}

	public List<MMCard> getMmcards() {
		return this.mmcards;
	}

	public void setMmcards(List<MMCard> mmcards) {
		this.mmcards = mmcards;
	}

	public MMCard addMmcard(MMCard mmcard) {
		getMmcards().add(mmcard);
		mmcard.setMmcardSet(this);

		return mmcard;
	}

	public MMCard removeMmcard(MMCard mmcard) {
		getMmcards().remove(mmcard);
		mmcard.setMmcardSet(null);

		return mmcard;
	}

}