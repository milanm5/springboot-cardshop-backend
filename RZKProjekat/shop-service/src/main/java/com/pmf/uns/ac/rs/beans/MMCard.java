package com.pmf.uns.ac.rs.beans;


public class MMCard {
	
	private int cardId;
	
	private String cardName;

	private double cardPrice;

	private int cardQuantity;

	private String cardType;

	
	
	public MMCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MMCard(int cardId, String cardName, double cardPrice, int cardQuantity, String cardType) {
		super();
		this.cardId = cardId;
		this.cardName = cardName;
		this.cardPrice = cardPrice;
		this.cardQuantity = cardQuantity;
		this.cardType = cardType;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public double getCardPrice() {
		return cardPrice;
	}

	public void setCardPrice(double cardPrice) {
		this.cardPrice = cardPrice;
	}

	public int getCardQuantity() {
		return cardQuantity;
	}

	public void setCardQuantity(int cardQuantity) {
		this.cardQuantity = cardQuantity;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	
	

}
