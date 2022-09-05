package com.assesment1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter the choice of your shape\n(1- square, 2-circle, 3- hexagon):");
		Scanner obj1 = new Scanner(System.in);
		int choice = obj1.nextInt();
		
		
		if (choice == 1)
		{
			System.out.println("Enter side of square: ");
			int side = obj1.nextInt();
			square obj2 = new square("square", side);
			System.out.println("The area of square is: "+obj2.calculateArea());
			
		}
		else if (choice == 2)
		{
			System.out.println("Enter radius of circle: ");
			int side = obj1.nextInt();
			circle obj3 = new circle("circle", side);
			System.out.println("The area of circle is:  "+obj3.calculateArea());
		}
		else if (choice == 3)
		{
			System.out.println("Enter side of hexagon: ");
			int side = obj1.nextInt();
			hexagon obj4 = new hexagon("hexagon", side);
			System.out.println("The area of hexagon is:  "+obj4.calculateArea());
		}
		else
		{
			System.out.println("Please enter the choice from above only");
		}

	}

}
