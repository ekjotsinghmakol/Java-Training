package com.Collection2;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList linked1= new LinkedList();
		
		linked1.add("India");
		linked1.add("Sri Lanka");
		linked1.add("Usa");
		linked1.add("Australia");
		linked1.add("Canada");
		
		Iterator iterator1 = linked1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}

	}

}
