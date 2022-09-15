package com.TryWithResources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResources {
	public static void TryWith() {
		try (Scanner scanner = new Scanner(new File("C:\\Count\\1.txt.txt"))) {
			while (scanner.hasNext()) {
				System.out.println(scanner.nextLine());
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}
}
