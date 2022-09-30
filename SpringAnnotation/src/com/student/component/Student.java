package com.student.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentobj")
public class Student {
	
	@Value("201")
	int rollNo;
	@Value("Ekjot")
	String name;
	@Value("70000")
	int salary;
	
	public Student(int rollNo, String name, int salary) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
	}
	
	public Student() {}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
