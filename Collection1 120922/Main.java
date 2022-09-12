package com.Collection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <String> list1 = new ArrayList<String>();
		
		list1.add("Tiger");
		list1.add("Lion");
		list1.add("Leopard");
		list1.add("Jaguar");
		list1.add("Cheetah");
		
		System.out.println(list1.get(0));
		
		//SIMPLE FOR
		System.out.println("Using Simple for loop\n");
		
		for (int i=0; i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println("Using advanced for loop\n");
		
		//ADVANCED FOR
		for (String s:list1)
		{
			System.out.println(s);
		}
		
		//ITERATOR
		System.out.println("Using Iterator\n");
		Iterator iterator1 = list1.iterator();
		while(iterator1.hasNext())
		{
			System.out.println(iterator1.next());
		}
		
		//LIST ITERATOR
		System.out.println("Using List Iterator\n");
		ListIterator iterator2 =list1.listIterator();
		while(iterator2.hasNext())
		{
			String name = (String)iterator2.next();
			System.out.println(name);
		}
		
	}

}
