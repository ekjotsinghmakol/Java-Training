package pno;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) 
	{
		Scanner obj1 = new Scanner(System.in);
		System.out.println("enter number to check if prime or not ");
		int num = obj1.nextInt();
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i) 
			    {
			      
			      if (num % i == 0)
			      {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
	 }
		
}

