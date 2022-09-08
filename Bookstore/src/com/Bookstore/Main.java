package com.Bookstore;

import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		
		Books bstore[];
		
		bstore = new Books[4];
		bstore[0]= new Books("Harry Potter", 800, "09/06/2010");
		bstore[1]= new Books("Jk rowling", 1200, "09/06/2010");		
		bstore[2]= new Books("Marvel Comics", 600, "09/06/2010");
		bstore[3]= new Books("Lord of Rings", 800, "09/06/2010");
		
		
		for (Books bstore1:bstore)
		{
			bstore1.display();
		}
		for (Books bstore1:bstore)
		{
			
			if(bstore1.getName()== "Harry Potter")
			bstore1.display();
		}
		Arrays.sort(bstore, new BookNameComparator());
		System.out.println(Arrays.binarySearch(bstore, new Books("Harry Potter",800,"09/06/2010")));
		
		
		
	}	
	
	

}
