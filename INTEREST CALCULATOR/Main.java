package bankingsystem;
import java.util.Scanner;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		
		bk obj1 = new bk(100000, 5, 2, 24, "male");
		System.out.println("principal:" + obj1.p + "\n"+ "rate:" + obj1.r + "\n"+ "Time:" +obj1.t + "\n"+"Age:" +obj1.age +"\n"+ "gender:"+ obj1.gender);
		
		if (obj1.age >60) {
			obj1.setR( obj1.r + 1);
			
		};
		if (obj1.t ==1) {
			obj1.setR( obj1.r);
			
		};
		
		if (obj1.t >1 && obj1.t <3) {
			obj1.setR( obj1.r + 5/1000);
			
		};
		if (obj1.t >3 && obj1.t <5) {
			obj1.setR( obj1.r + 1/100);
			
		};
		if (obj1.t >5) {
			obj1.setR( obj1.r + 15/1000);
			
		};
		if (obj1.gender == "female") {
			obj1.setR( obj1.r + 5/1000);
			
		};
		if (obj1.gender == "female" && obj1.age > 60) {
			obj1.setR( obj1.r + 15/1000);
			
		};
		float si =(obj1.p*obj1.r*obj1.t/100);
	
		
		System.out.println("The interest is " + si);
	}

}
