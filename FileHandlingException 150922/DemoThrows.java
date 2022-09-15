package com.FileHandlingException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DemoThrows {
	public static void readFile() throws FileNotFoundException{
		Scanner input = new Scanner(new File("newfile.txt"));
	}
}
