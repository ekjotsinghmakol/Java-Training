package com.CollectionSet;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set set = new LinkedHashSet();
		
		Books book1 = new Books(101,"Harry Potter",2000,"Jk Rowling");
		Books book2 = new Books(102,"Tin Tin",3000,"Max Payne");
		Books book3 = new Books(103,"Lord Of the Rings",7000,"Jk Rowling");
		Books book4 = new Books(104,"Harry Potter3",4000,"Jk Rowling");
		Books book5 = new Books(105,"Marvel Comic",5000,"Stark");
		
		set.add(book1);
		set.add(book2);
		set.add(book3);
		set.add(book4);
		set.add(book5);
		
		for (Object b:set) {
			System.out.println(b);
		}
		System.out.println("In decreasing order of Price\n");
		
		TreeSet<Books>tree = new TreeSet<>(set);
		for (Books obj:tree) {
			System.out.println(obj.getBookId()+ " "+ obj.getName()+" "+obj.getPrice()+" "+ obj.author);
		}
		
	}

}
