package positiveornegative;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the no to check");
		int a= obj1.nextInt();
		int temp;
		if (a>0)
		{
			System.out.println("positive number");
		}
		else if (a==0)
		{
			System.out.println("ZERO");
		}
		else 
		{
			System.out.println("Negative");
		}
		
		
		
		

	}

}
