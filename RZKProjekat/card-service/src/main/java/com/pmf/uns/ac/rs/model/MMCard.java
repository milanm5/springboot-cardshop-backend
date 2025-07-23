package com.pmf.uns.ac.rs.model;

import java.io.Serializable;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


/**
 * The persistent class for the MMCard database table.
 * 
 */
@Entity
@NamedQuery(name="MMCard.findAll", query="SELECT m FROM MMCard m")
public class MMCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cardId;

	@NotBlank
	private String cardName;

	private double cardPrice;

	@NotNull
	private int cardQuantity;
	
	private String cardType;

	//bi-directional many-to-one association to MMCardSet
	@ManyToOne
	@JoinColumn(name="cardSetId")
	private MMCardSet mmcardSet;

	public MMCard() {
	}

	public int getCardId() {
		return this.cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return this.cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public double getCardPrice() {
		return this.cardPrice;
	}

	public void setCardPrice(double cardPrice) {
		this.cardPrice = cardPrice;
	}

	public int getCardQuantity() {
		return this.cardQuantity;
	}

	public void setCardQuantity(int cardQuantity) {
		this.cardQuantity = cardQuantity;
	}

	public String getCardType() {
		return this.cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public MMCardSet getMmcardSet() {
		return this.mmcardSet;
	}

	public void setMmcardSet(MMCardSet mmcardSet) {
		this.mmcardSet = mmcardSet;
	}

}