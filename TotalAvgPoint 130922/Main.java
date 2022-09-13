package com.TotalAvgPoint;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of matches played");
		int noOfmatches= sc.nextInt();
		ArrayList <Double> scores = new ArrayList<Double>();
		
		
		System.out.println("Enter the scores");
		int totalPoints = 0;
		float avgPoints ;
		for (int i=0; i<noOfmatches;i++) {
			double tempScore= sc.nextDouble();
			scores.add(tempScore);
			totalPoints += scores.get(i);
		}
		avgPoints = totalPoints/noOfmatches;
		System.out.println("Total points are:  "+ totalPoints);
		System.out.println("Avg points are: "+ avgPoints);
		
		

	}

}
