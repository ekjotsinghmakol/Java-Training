package com.streamapi.employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSort{
	public void sort() {
		List<Employee> listEmp2 = listEmployee.stream()
				.sorted()
				.collect(Collectors.toList());
		System.out.println(listEmp2);
	}

}
