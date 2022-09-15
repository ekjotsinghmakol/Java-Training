package com.throwage;

import java.util.Scanner;

public class AgeThrow  {
	
	public static void ageCheck(){
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		if (age < 19) {
			throw new InvalidAgeException("Age is less than 19");
		} else {
			System.out.println("Age is " + age+" and is a valid age ");
		}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
