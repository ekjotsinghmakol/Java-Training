package com.card;

public class Payback extends Card{
	int cNo;
	int points;
	int amount;
	
	public Payback(String holderName, String cardNumber, String expirydate,int points,int amount) {
		super(holderName, cardNumber, expirydate);
		
	}
	public Payback(int cNo, int points, int amount) {}
	
	public Payback() {}
	
	public int getcNo() {
		return cNo;
	}
	public void setcNo(int cNo) {
		this.cNo = cNo;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void startPayback() {
		System.out.println("Card Number:"+" " +cNo + "\n" +"Points earned:"+" "+points + "\n" + "Total Amount:"+ amount);
	}


	
	

}
