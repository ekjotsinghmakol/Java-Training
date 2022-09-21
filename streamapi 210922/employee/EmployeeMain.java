package com.streamapi.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		Employee emp1 = new Employee(101, "Rohit", 60000);
		Employee emp2 = new Employee(102, "Mohitm", 80000);
		Employee emp3 = new Employee(105, "Harsh", 70000);
		Employee emp4 = new Employee(110, "Anubhav", 50000);
		Employee emp5 = new Employee(120, "Rahul", 90000);

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		System.out.println("Ends with m");
		List<Employee> listEmp1 = list.stream()
				.filter(name -> name.getName().endsWith("m"))
				.collect(Collectors.toList());
		System.out.println(listEmp1);
		
		System.out.println("\nSorting according to name");
		List<Employee> listSort = list.stream()
				.sorted((p1, p2) -> ((String) p1.getName()).compareToIgnoreCase(p2.getName()))
				.collect(Collectors.toList());
		System.out.println(listSort);
		
		
		System.out.println("\nTotal Salary");
		double totalSalary = list.stream().collect(Collectors.summingDouble(salary -> salary.getSalary()));
		System.out.println(totalSalary);
		
		System.out.println("\nEmployees having salary greater than 70k");
		long count = list.stream().filter(salary -> salary.getSalary() > 70000).count();
		System.out.println("Count is: " + count);
		
		System.out.println("\nmin and max salary");
		Employee maxSalary = list.stream().max((salary1, salary2) -> salary1.getSalary() > salary2.getSalary() ? 1 : -1)
				.get();
		System.out.println("Max salary is: " + maxSalary);

		Employee minSalary = list.stream().min((salary1, salary2) -> salary1.getSalary() > salary2.getSalary() ? 1 : -1)
				.get();
		System.out.println("Min salary is: " + minSalary);
		


	}

}
