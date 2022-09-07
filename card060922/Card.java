package com.card;

abstract class Card {
	protected String holderName;
	protected String cardNumber;
	protected String expirydate;
	
	public Card(String holderName, String cardNumber, String expirydate) {
		super();
		this.holderName = holderName;
		this.cardNumber = cardNumber;
		this.expirydate = expirydate;
	}
	public Card() {}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(String expirydate) {
		this.expirydate = expirydate;
	}
	
	
	
}
