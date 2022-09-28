package com.bhav.dao;

import com.bhav.bean.Company;

public class TesterCompany {

	public static void main(String[] args) {
		MyConnection con = new MyConnection();
		con.getConnection();
//		addCompany();
		
//		 EmployeeDao addemp = new EmployeeDao();

			

}
	public static void addCompany() {
		try {
			Company company = new Company(105, "Bhavna", 30000, "Banglore", "2022-10-11");
			EmployeeDao obj = new EmployeeDao();
			int i = obj.addCompany(company);
			if (i > 0) {
				System.out.println("Record Inserted");
			} else {
				System.out.println("Not Inserted");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
}
}
