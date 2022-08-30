package overriding;

import overriding.overridingfunc.Mohit;
//import overriding.overridingfunc.rohit;

public class Main {

	public static void main(String[] args) {
		
//		ParentClass obj=New SubClass();
		
		Mohit obj1 = new Mohit();

		System.out.println(obj1.getage());
		
		overridingfunc obj2 = new rohit();
		System.out.println(obj2.getage());
		

	}

}
