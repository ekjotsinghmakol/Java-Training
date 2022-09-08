package com.Enum;

public class Main {

	public static void main(String[] args) {
		
		for (Players play: Players.values()) {
			System.out.println(play);
			System.out.println(play.score );
		}
		

	}

}
