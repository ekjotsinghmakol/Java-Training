package com.functionalinterface.predicate;

import java.util.function.Predicate;

public class MyPredicate {

	public static void main(String[] args) {
		
		predicate(199999,(balance)->balance>200000);
	}
	public static void predicate(int balance, Predicate<Integer>ref1) {
		if (ref1.test(balance)) {
			System.out.println("You can withdraw");
		}else {
			System.out.println("You can't withdraw");
		}
	} 
}
