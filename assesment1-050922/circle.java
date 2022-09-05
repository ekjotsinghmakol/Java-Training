package com.assesment1;

public class circle extends shapes {
	int radius;
	
	public circle(String shapename, int radius) {
		super(shapename);
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double calculateArea() 
	{
		return 3.14*radius*radius;
	}

}
