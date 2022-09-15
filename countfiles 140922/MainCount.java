package com.countfiles;

import java.io.File;

public class MainCount {

	public static void main(String[] args) {
		
		
		File directory = new File("C:\\Count");
		int fileCount = directory.list().length;
		System.out.println("The no of files are "+fileCount);
		
		
		}
		
	}


