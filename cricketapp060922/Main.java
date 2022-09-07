package com.cricketapp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter your choice");
		System.out.println("Enter 1 for player details");
		System.out.println("Enter 2 for delivery details");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		Delivery obj1 = new Delivery();
		
		if (choice ==1)
		{
			System.out.println("enter bowler details");
			String bowler = sc.next();
			System.out.println("enter batsman details");
			String batsman = sc.next();
			obj1.displayPlayerdetails(bowler, batsman);
			
		}
		else if (choice ==2)
		{
			System.out.println("Enter the runs to display");
			long runs = sc.nextLong();
			obj1.displayDeliveryDetails(runs);
		}

	}

}
