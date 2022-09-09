package com.insertionsort;

public class Main {

	public static void main(String[] args) {
		
		 int[] arr1 = {9,14,3,2,43,11,58,22};    
	        System.out.println("Before Insertion Sort");    
	        for(int i:arr1){    
	            System.out.print(i+" ");    
	        }    
	        System.out.println();    
	        InsertionSort obj = new InsertionSort();
	        obj.insertionSort(arr1);   
	           
	        System.out.println("After Insertion Sort");    
	        for(int i:arr1){    
	            System.out.print(i+" ");    
	        }    
	    }    

	}


