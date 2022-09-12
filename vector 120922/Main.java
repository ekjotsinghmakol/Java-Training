package com.vector;

import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		List list1 = new Vector();
		list1.add("Raj");
		list1.add("Rajesh");
		list1.add("Rahul");
		list1.add("Rohan");
		
		System.out.println(list1);
		System.out.println("size is "+list1.size());
		
		Vector v = new Vector();
		list1.add(4, "Rohit");
		System.out.println(list1);
		System.out.println("Capacity is "+v.capacity());
		list1.remove(0);
		System.out.println(list1);
		list1.set(2, "Ekjot");
		System.out.println(list1);
		
		

	}

}
