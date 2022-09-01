package largestof3;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter three numbers : ");
		int a = obj1.nextInt();
		int b = obj1.nextInt();
		int c = obj1.nextInt();
		int largest,temp;
		
		temp = a>b?a:b;
		largest = c>temp?c:temp;
		
		System.out.println("the Largest number out of the 3 is:  "+largest);
		
		
		

	}

}
