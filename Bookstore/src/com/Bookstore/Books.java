package com.Bookstore;

public class Books{
	String name;
	int price;
	String date;
	
	public Books(String name, int price, String date) {
		super();
		this.name = name;
		this.price = price;
		this.date = date;
	}
	public Books() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	public int display() {
		System.out.println(name+ " "+ price +" "+ date);
		return 0;
	}


}
