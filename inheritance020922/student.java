package inheritance;

public class student extends employee{
	
	int rollno;
	String branch;
	int perc;
	
	public student(String pname, int age, String address, int eid, String company, int salary, int rollno,
			String branch, int perc) {
		super(pname, age, address, eid, company, salary);
		this.rollno = rollno;
		this.branch = branch;
		this.perc = perc;
	}
	protected void p1() {
		System.out.println("Student is being displayed");
	}
	
	
}
