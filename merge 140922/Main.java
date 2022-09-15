package com.merge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		
		try {
			
			PrintWriter my_pw = new PrintWriter("C:\\Count\\3.txt");
		    BufferedReader my_br = new BufferedReader(new FileReader("C:\\Count\\1.txt.txt"));
		    String my_line = my_br.readLine();
		    while (my_line != null) {
		       my_pw.println(my_line);
		       my_line = my_br.readLine();
		    }
		    my_br = new BufferedReader(new FileReader("C:\\Count\\2.txt.txt"));
		    my_line = my_br.readLine();
		    while(my_line != null) {
		       my_pw.println(my_line);
		       my_line = my_br.readLine();
		    }
		    my_pw.flush();
		    my_br.close();
		    my_pw.close();
		    System.out.println("Merge complete");
		    
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}


