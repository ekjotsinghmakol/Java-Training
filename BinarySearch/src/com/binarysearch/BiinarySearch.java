package com.binarysearch;

public class BiinarySearch {
	
	public static void binarySearch(int arr[], int first, int last, int data){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < data ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == data){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
	
}
}
