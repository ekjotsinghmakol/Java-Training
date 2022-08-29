package bksystem;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);   
		bks obj1 = new bks();
		System.out.print("Enter Principle amount:  ");  
		float principal= sc.nextFloat();  
		System.out.print("Enter ROI:  ");  
		float ROI= sc.nextFloat();  
		System.out.print("Enter Time:  ");  
		float time = sc.nextFloat();  
		System.out.print("Enter Age:  ");  
		int age = sc.nextInt(); 
		System.out.print("Enter Gender: ");  
		String gender = sc.next(); 
		System.out.print("Enter type of interest (Enter 1 for si and 2 for compound) :  ");  
		String type= sc.next();
		
		float si= (principal * time * ROI) / 100;
		System.out.println("Your Simple interest is: "+si);
		
		if(age > 60) {
			setR
		};
		
	}

}
