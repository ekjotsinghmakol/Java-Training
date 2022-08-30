package abs3;

public class Main {

	public static void main(String[] args) {
		
	student stu1 = new student(101, "Ekjot", "CSE");
	student stu2 = new student(102, "Dhruv", "CSE");
	student stu3 = new student(103, "Daksh", "IT");
	System.out.println(stu1.id + "  " + stu1.name+"  "+ stu1.branch);
	System.out.println(stu2.id + "  " + stu2.name+"  "+ stu2.branch);
	System.out.println(stu3.id + "  " + stu3.name+"  "+ stu3.branch);
	
	
	 stu1.setName("Raj");
	 System.out.println(stu1.id+ "  "+ stu1.getName()+"  "+ stu1.branch);
	}
	
	
}
