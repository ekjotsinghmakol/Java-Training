package fibrec;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		fib obj1 = new fib();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find fibonnaci series upto that");
		int num = sc.nextInt();
		for (int i =0; i<=num; i++) 
		{
		System.out.println(obj1.fib(i));
		}

}
}
