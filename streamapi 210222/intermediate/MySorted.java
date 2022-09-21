package com.streamapi.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MySorted {

	public static void main(String[] args) {
		
		List <String> list1 = new ArrayList <String>();
		
		list1.add("Nike");
		list1.add("Puma");
		list1.add("Gucci");
		list1.add("Prada");
		list1.add("Dior");
		
		List listSorted = list1.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println(listSorted);

	}

}
