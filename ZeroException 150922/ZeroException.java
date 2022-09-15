package com.ZeroException;

import java.util.Scanner;

public class ZeroException {

	public int zeroEx() {
		try {
			Scanner sc= new Scanner(System.in);
			System.out.println("eter two numbers");
			
			int num1=sc.nextInt();
			int num2= sc.nextInt();
			int num3 = num1 / num2;
			
			return num3;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("executed");
		}
		return 0 ;

	}
}
