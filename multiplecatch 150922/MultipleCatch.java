package com.multiplecatch;

public class MultipleCatch {
	
	public static void Multiple() {
		try {
			String name = null;
			System.out.println(name.length());
			int num = 10/0;
		}catch(NullPointerException e) {
			System.out.println("NULL EXCEPTION HANDLED");
		}catch(ArithmeticException e) {
			System.out.println("ARITHMETIC EXCEPTION HANDLED");
			System.out.println(e);
		}finally {
			System.out.println("INSIDE FINAL BLOCK");
		}
	}
}
