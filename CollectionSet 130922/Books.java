package com.CollectionSet;

import java.util.Objects;

public class Books implements Comparable <Books> {	
	int bookId;
	String name;
	int price;
	String author;
	public Books(int bookId, String name, int price, String author) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.author = author;
		
	}
	
	public Books() {}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String toString() {
		return bookId + " " + name + " " + price + " " + author;
	}

	@Override
	public int compareTo(Books b) {
		if (this.price<b.price) {
			return 1;
		}
		else if(this.price>b.price){
			return -1;
		}
		else {
			return 0;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, bookId, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(author, other.author) && bookId == other.bookId && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
	
}
