package com.card;

import java.util.Scanner;

import com.company.Company;

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
			pay.startPayback();
		}
		else if (choice ==2)
		{
			mem.startMembership();
		}
		
		Payback pMember[];
		pMember = new Payback[4];
		pMember[0] =new Payback(101,2000,16000);
		
	
	}
}
