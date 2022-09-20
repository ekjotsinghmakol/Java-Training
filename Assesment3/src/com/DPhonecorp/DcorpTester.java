package com.DPhonecorp;

import java.util.Scanner;

public class DcorpTester {

	public static void main(String[] args) throws Exception {

		// USER REGISTRATION AND LOGIN USING AN OBJECT
		UserAccounts u1 = new UserAccounts();
		u1.userRegistration();
		u1.userLogin();

		// REFERRAL CODE INPUT AND STORING THE DATA
		Referral r1 = new Referral();
		r1.referralInput();

//		System.out.println("Press 1 to view data and 2 to delete data");
//		Scanner sc = new Scanner(System.in);
//		int choice = sc.nextInt();
		System.out.println("All the data present is: \n");
		try {
			if (1 == 1) {
				Referral obj1 = new Referral();
				obj1.viewData();
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		System.out.println("Do you want to delete all data ?");
		Scanner sc1 = new Scanner(System.in);
		try  {
			String option = sc1.next();
			if (option == "yes") {
				Referral obj2 = new Referral();
				obj2.deleteData();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		sc1.close();

	}

}
