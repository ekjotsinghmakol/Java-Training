package employee;

public class employee {
	int empid;
	String name;
	int salary;
	static int count=0;
	static String company="Bhavnacorp";
	
	public employee(int empid, String name, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		count+=1;
		 
		if (salary>50000)
		{
			System.out.println(empid + " "+name +" "+salary + " "+ company);
		}
	}
	
	

}
