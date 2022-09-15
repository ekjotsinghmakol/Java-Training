package com.countfiles;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

        File file = new File("C:\\Count\\1.txt.txt");
        try{
        	
        	Scanner sc = new Scanner(new FileInputStream(file));
            int count=0;
            while(sc.hasNext()){
                sc.next();
                count++;
            }
        System.out.println("Number of words: " + count);
    
        } catch (Exception e) {
        	System.out.println(e);
        }

	}

}
