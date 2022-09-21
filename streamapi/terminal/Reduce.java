package com.streamapi.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reduce {

	public static void main(String[] args) {
		List <Integer> list1 = Arrays.asList(10,-15,20,-25,30);
		int positive = list1.stream()
				.filter(num -> num>0)
				.reduce(0,(ans,i)->ans+i);
		System.out.println("Sum of all positive numbers are "+positive);

	}

}
