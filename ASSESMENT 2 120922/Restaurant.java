package com.AshaFoodSoftware;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Restaurant {
	
	//METHOD TO TAKE INPUT OF LAT AND LONG, SEARCH AND THEN DISPLAY THE LIST OF RESTAURANTS
	public void searchLatlong() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Asha Food Services, we are happy to serve you !!\n");
		System.out.println("Enter the latitude to search for Restraunts near you: ");
		 double latitude = sc.nextDouble();
		System.out.println("Enter the longitude to search for Restraunts near you: ");
		 double slongitude = sc.nextDouble();
		 
		 int n= noOfhotels();
		 if (n<5)
		 {
			 System.out.println("Serching within 2.5 kms");
			 displayHotels2();
			 
		 }
		 else 
		 {
			 System.out.println("Searching within 1.5 kms");
			 displayHotels1();
		 }
	}
	
	//GENERATES A RANDOM NUMBER TO SEARCH FOR HOTELS
	public int noOfhotels() {
		Random random = new Random();
		int max = 10;
		int n= random.nextInt(max);
		return n;
	}
	
	//DISPLAYS HOTEL FOR RANGE 1.5KMS
	public void displayHotels1() {
		List list1= new ArrayList();
		
		list1.add("KFC");
		list1.add("Subway");
		list1.add("Burger King");
		list1.add("Mcdonalds");
		
		for (Object o: list1)
		{
			System.out.println(o);
		}
	}
	
	//DISPLAYS HOTELS FOR RANGE 2.5KMS
	public void displayHotels2() {
		List list2= new ArrayList();
		
		list2.add("KFC");
		list2.add("Subway");
		list2.add("Burger King");
		list2.add("Mcdonalds");
		list2.add("Chaayos");
		list2.add("Big Chill");
		list2.add("Dominoz");
		list2.add("Pizza Hut");
		list2.add("Al Bake");
	
		for (Object o: list2)
		{
			System.out.println(o);
		}
	}
}
