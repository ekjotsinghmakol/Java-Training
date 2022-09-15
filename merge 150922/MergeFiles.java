package com.merge;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MergeFiles {
	
	
	public static void merge() throws IOException {
		File file = new File("C:\\Count\\new1.txt");
		File file2 = new File("C:\\Count\\new1.txt");
	
	if (file.exists() && file.isFile()) {
		try {
			FileReader reader = new FileReader(file);
			FileReader reader2 = new FileReader(file2);
			FileWriter writer = new FileWriter("C:\\Count\\new1-2.txt");
			
			Scanner Reader =new Scanner(file);
			Scanner Reader2 =new Scanner(file2);
			while(true) {
				int i = reader.read();
				int j = reader2.read();
				if(i==-1 && j==-1) {
					break;
					writer.write(i);
					writer.write(j);
					System.out.println((char)i);
					System.out.println((char)j);
					writer.close();
				}
				
			}
			writer.close();
			
			System.out.println("merge done");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	}
}
