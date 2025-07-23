package com.pmf.uns.ac.rs.model;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


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

	private String cardName;

	private double cardPrice;

	private int cardQuantity;

	private String cardType;

	//bi-directional many-to-one association to MMOrder
	@OneToMany(mappedBy="mmcard")
	@JsonIgnore
	private List<MMOrder> mmorders;

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

	public List<MMOrder> getMmorders() {
		return this.mmorders;
	}

	public void setMmorders(List<MMOrder> mmorders) {
		this.mmorders = mmorders;
	}

	public MMOrder addMmorder(MMOrder mmorder) {
		getMmorders().add(mmorder);
		mmorder.setMmcard(this);

		return mmorder;
	}

	public MMOrder removeMmorder(MMOrder mmorder) {
		getMmorders().remove(mmorder);
		mmorder.setMmcard(null);

		return mmorder;
	}

	public MMCardSet getMmcardSet() {
		return this.mmcardSet;
	}

	public void setMmcardSet(MMCardSet mmcardSet) {
		this.mmcardSet = mmcardSet;
	}

}