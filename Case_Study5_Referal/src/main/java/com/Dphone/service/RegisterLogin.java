package com.Dphone.service;

import java.util.Scanner;

public class RegisterLogin {

	// METHOD FOR USER TO REGISTER
	public void userRegistration() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please fill the details to Register with us \n");
			System.out.println("Enter your name: ");
			String name = sc.next();
			System.out.println("Enter your email-id: ");
			String email = sc.next();
			System.out.println("Enter your Mobile number: ");
			String mobile = sc.next();
			
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("You are now registered with us !!\n");
	}

	// METHOD FOR USER TO LOGIN
	public void userLogin() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to the Login page\n");
			System.out.println("Enter your mobile number: ");
			String mobileNo = sc.next();
			System.out.println("Enter the 4 digit otp: ");
			int otp = sc.nextInt();
			
			sc.close();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("You are now successfully logged in !!");
	}
}
