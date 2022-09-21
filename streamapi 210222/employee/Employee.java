package com.streamapi.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	int eId;
	String name;
	int salary;

	// CONSTRUCTOR

	public Employee(int eId, String name, int salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
	
	

	// DEFAULT CONSTRUCTOR

	public Employee() {
	}

	// GETTERES AND SETTERS

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

	// METHOD TO DISPLAY ALL EMPLOYEES

	@Override
	public String toString() {
		return " eId=" + eId + ", name=" + name + ", salary=" + salary + " ";
	}
	
	
	
	
	public void sortedEmployees() {
		
	}
	}

	


