package com.card;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the stype of card you want ");
		System.out.println("1 for Payback ");
		System.out.println("2 for Memebership ");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();	
		Payback pay = new Payback();
		Membership mem= new Membership();
		if (choice ==1)
		{	
			System.out.println("Enter CardHolder Name: ");
			String holderName = sc.next();
			System.out.println("Enter Card Number: ");
			String cardNumber = sc.next();
			System.out.println("Enter Expiry Date: ");
			String expiryDate = sc.next();
			System.out.println("Enter pointsEarned: ");
			int pointsEarned = sc.nextInt();
			System.out.println("Enter Total Amount: ");
			double totalAmount = sc.nextDouble();
			pay.show();
		}
		else if (choice ==2)
		{	
			System.out.println("Enter CardHolder Name: ");
			String holderName = sc.next();
			System.out.println("Enter Card Number: ");
			String cardNumber = sc.next();
			System.out.println("Enter Expiry Date: ");
			String expiryDate = sc.next();
			System.out.println("Enter Rating: ");
			int rating = sc.nextInt();
			mem.show();
		}
		
		
		
	
	}
}
