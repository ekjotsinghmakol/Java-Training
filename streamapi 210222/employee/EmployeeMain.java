package com.streamapi.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> listEmployee = new ArrayList<Employee>();
		Employee emp1 = new Employee(101, "Rohit", 60000);
		Employee emp2 = new Employee(102, "Mohitm", 80000);
		Employee emp3 = new Employee(105, "Harsh", 70000);
		Employee emp4 = new Employee(110, "Anubhav", 50000);
		Employee emp5 = new Employee(120, "Rahul", 90000);

		listEmployee.add(emp1);
		listEmployee.add(emp2);
		listEmployee.add(emp3);
		listEmployee.add(emp4);
		listEmployee.add(emp5);

		List<Employee> listEmp1 = listEmployee.stream()
				.filter(name -> name.getName().endsWith("m"))
				.collect(Collectors.toList());
		System.out.println(listEmp1);
		
//		List<Employee> listEmp2 = listEmployee.stream()
//				.sorted()
//				.collect(Collectors.toList());
//		System.out.println(listEmp2);
		
		   // Total Salary
//        System.out.println("\nTotal Salary");
//        List<Employee> listEmp3 = (List<Employee>) listEmployee.stream();
//        int totalSalary = listEmp3.stream()
////        		.filter(num->num>0)
////        		.reduce(0,(ans,i)->ans+i);
//        		.collect(Collectors.summingInt(salary -> salary.getSalary()));
//        System.out.println(totalSalary);

	}

}
