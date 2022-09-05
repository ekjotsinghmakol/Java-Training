package com.assesment1;

public class square extends shapes {
	int length;
	
	public square(String shapename, int length) {
		super(shapename);
		this.length = length;
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public double calculateArea() 
	{
		return length*length;	
	}

}
