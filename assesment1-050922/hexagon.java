package com.assesment1;

public class hexagon extends shapes {
	
	int side;
	
	public hexagon(String shapename, int side) {
		super(shapename);
		this.side = side;
	}
	

	public int getSide() {
		return side;
	}


	public void setSide(int side) {
		this.side = side;
	}


	public double calculateArea() 
	{
		return (3*1.732*side*side)/2;	
	}
}
