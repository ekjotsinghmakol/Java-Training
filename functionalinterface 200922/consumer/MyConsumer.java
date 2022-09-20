package com.functionalinterface.consumer;

import java.util.function.Consumer;

public class MyConsumer {

	public static void main(String[] args) {
		Consumer<Integer> ref1 = (num) -> {
			if (num % 2 == 0) {
				System.out.println(num + " is an Even number");
			} else {
				System.out.println(num + "is an odd number");
			}
		};

		ref1.accept(90);
	}

}
