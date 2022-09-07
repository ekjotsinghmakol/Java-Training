package com.company;

public class Main {

	public static void main(String[] args) {
		Company com[];
		com = new Company[4];
		com[0] = new Company(101, "Bhavna","Noida", 500, 90);
		com[1] = new Company(102, "KPMG","Patan", 1000, 200);
		com[2] = new Company(103, "Apple","Gurgaon", 9900, 500);
		com[3] = new Company(104, "Google","Patan", 10000, 1000);
		
		for (Company com1:com)
		{
			com1.display();
		}
		System.out.println("Companies having employees more than 100 are ");
		for (Company com1:com)
		{	
			if (com1.getEmpno()>100)
			com1.display();
		}
		
		System.out.println("Search records by city name: Patan");
		String city = "Patan";
		boolean flag = false;
		
		
		for (Company com1:com)
		{	
			if (city.equals(com1.getCity()))
			{
				flag = true;
				com1.display();
			}
			
		}
		if(!flag) 
		{
			System.out.println("No record found");
		}
		
		System.out.println("Search records by Turnover between 1000 and 10000");
		for (Company com1:com)
		{	
			if (com1.getTurnover()>1000 )
			com1.display();
		}
	}

}
