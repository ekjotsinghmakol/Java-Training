package com.functionalinterface.Supplier;

import java.util.function.*;

public class TestSupplier {

	public static void main(String[] args) {
		Supplier<Double> ref1 = () -> Math.random();
		System.out.println("The Random value of supplier is " + ref1.get());
	}

}
