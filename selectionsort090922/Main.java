package com.selectionsort;

public class Main {

	public static void main(String[] args) {
		   int[] arr1 = {9,14,3,2,43,11,58,22};  
		   SelectionSort obj = new SelectionSort();
	        System.out.println("Before Selection Sort");  
	        obj.printArray(arr1); 
	        System.out.println("After Selection Sort"); 
	        obj.selectionSort(arr1); 
	        obj.printArray(arr1); 
	    }  

	}


