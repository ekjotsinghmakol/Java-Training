package inheritance;

public class employee extends Person {
	
	int eid;
	String company;
	int salary;
	
	public employee(String pname, int age, String address, int eid, String company, int salary) {
		super(pname, age, address);
		this.eid = eid;
		this.company = company;
		this.salary = salary;
	}
	protected void p1() {
		System.out.println("employees is being displayed");
	}
	
}
