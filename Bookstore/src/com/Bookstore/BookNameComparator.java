package com.Bookstore;

import java.util.Comparator;

public class BookNameComparator implements Comparator <Books>{

	@Override
	public int compare(Books b1, Books b2) {
		// 
		return b1.getName().compareTo(b2.getName());
	}

}
