package com.functionalinterface.Lambda;

public class TestLambda {

	public static void main(String[] args) {

		LambdaExpression ref = (num1) -> {
			int square = num1 * num1;
			System.out.println("The square is  " + square);
		};

		LambdaExpression2 ref2 = (num2) -> System.out.println("The cube is " + num2 * num2 * num2);

		LambdaExpression3 ref3 = () -> System.out.println("WITHOUT ANY ARGUMENT");

		LambdaValue ref4 = (num1, num2) -> {
			int sum = num1 + num2;
			System.out.println("The sum is " + sum);
			return sum;

		};

		ref.square(10);
		ref2.cube(10);
		ref3.display();
		ref4.add(10, 20);
	}

}
