package com.calc.dao;

public class CalcDao {
	
	
	
	public static int addition (int num1,int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	public static double addition (double num1,double num2) {
		double sum = num1+num2;
		return sum;
	}
	
	public static String addition(String string1, String string2) {
		String sum = string1 + string2;
		return sum;
	}
	
	public static double division(double num1, double num2) {
		double result = num1/num2;
		return result;
	}
	
	public static int substraction(int num1, int num2) {
		int result = num1-num2;
		return result;
	}
	
	public static int multiplication(int num1, int num2) {
		int result = num1*num2;
		return result;
	} 
}
