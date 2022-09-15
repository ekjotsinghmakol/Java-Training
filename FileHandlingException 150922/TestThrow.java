package com.FileHandlingException;

import java.io.FileNotFoundException;

public class TestThrow {

	public static void main(String[] args) {
		try {
			DemoThrows.readFile();
		}catch(FileNotFoundException e) {
			System.out.println("not found");
		}

	}

}
