package com.Enum;

public class EnumTest {
	private enum Players{
		Kohli(101),Rohit(78),Pant(45);
	
	int score;
	private Players(int score){
		this.score= score;
	}
	private Players() {
		
	}
	
}
}
