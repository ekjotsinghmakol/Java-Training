package com.streamapi.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		List <String> listUnfiltered = new ArrayList <String>();
		
		listUnfiltered.add("Nike");
		listUnfiltered.add("Puma");
		listUnfiltered.add("Gucci");
		listUnfiltered.add("Prada");
		listUnfiltered.add("Dior");
		
		List listFiltered = listUnfiltered.stream()
				.filter(name -> name.startsWith("P"))
				.collect(Collectors.toList());
		
		System.out.println(listUnfiltered);
		System.out.println(listFiltered);

	}

}
