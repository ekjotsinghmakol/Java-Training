package com.cricketapp;

public class Delivery {
	public void displayPlayerdetails(String bowler, String batsman) {
		System.out.println(bowler+" "+ "to"+" " + batsman);
	}
	
	public void displayDeliveryDetails(Long runs) {
		
	if (runs ==6)
	{
		System.out.println("That's a massive SIX !!");
	}
	else if (runs ==4 )
	{
		System.out.println("That's a cracking shot for FOUR !!");
	}
	else
	{
		System.out.println("The runs scored on current ball is "+runs);
	}
	}
	
	
}
