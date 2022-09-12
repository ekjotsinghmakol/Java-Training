package com.AshaFoodSoftware;

import java.util.Scanner;

public class UserAccounts {
	
	//METHOD FOR USER TO REGISTER
	public void userRegistration() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please fill the details to Register with us \n");
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your email-id: ");
		String email = sc.next();
		System.out.println("Enter your Mobile number: ");
		String mobile = sc.next();
		System.out.println("Enter your current city: ");
		String city = sc.next();
		System.out.println("You are now registered with us !!\n");
	}
	
	//METHOD FOR USER TO LOGIN 
	public void userLogin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Login page\n");
		System.out.println("Enter your mobile number: ");
		String mno= sc.next();
		System.out.println("Enter the 4 digit otp: ");
		int otp = sc.nextInt();
		System.out.println("You are now successfully logged in !!");
	}
	
}
