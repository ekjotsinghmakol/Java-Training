package com.card;

public class Membership extends Card{
	
	int cardNo;
	int rating;
	
	public Membership(String holderName, String cardNumber, String expirydate,int rating) {
		super(holderName, cardNumber, expirydate);
		
	}
	
	public Membership(){}
	
	
	
	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public void show() {
		
		System.out.println(holderName + " | " + cardNumber + " | " + expirydate + " | " + rating);
	}
	

	
}
