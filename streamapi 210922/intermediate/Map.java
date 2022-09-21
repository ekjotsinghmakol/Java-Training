package com.streamapi.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {

	public static void main(String[] args) {
		
		List <Integer> list1 = Arrays.asList(10,20,30,40,50);
		List <Integer> listSquare = list1.stream()
				.map(num -> num*num)
				.collect(Collectors.toList());
		System.out.println(list1);
		System.out.println(listSquare);

	}

}
