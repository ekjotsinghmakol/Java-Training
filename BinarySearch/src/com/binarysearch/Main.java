package com.binarysearch;

public class Main {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		 int data = 50;  
		 int last=arr.length-1;
		 BiinarySearch obj = new BiinarySearch();
	      obj.binarySearch(arr,0,last,data);    

	}

}
