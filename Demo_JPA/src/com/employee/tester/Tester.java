package com.employee.tester;

import com.employee.dao.EmployeeDao;

public class Tester {

	public static void main(String[] args) {
//		EmployeeDao.addData();
//		EmployeeDao update = new EmployeeDao();
//		update.updateData();
		EmployeeDao delete = new EmployeeDao();
//		delete.deleteEmployee();
		EmployeeDao get = new EmployeeDao();
		get.getEmployee();
	}

}
