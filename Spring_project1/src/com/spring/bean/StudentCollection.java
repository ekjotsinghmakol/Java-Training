package com.spring.bean;

import java.util.Map;

public class StudentCollection {
	int rollNo;
	String name;
	int salary;
	ExamCollection examData;
	Map <String, Integer> address;
	
	public StudentCollection() {}
	public StudentCollection(int rollNo, String name, int salary, Map<String, Integer> address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	

	public StudentCollection(int rollNo, String name, int salary, ExamCollection examData,
			Map<String, Integer> address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
		this.examData = examData;
		this.address = address;
	}
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
	
	

	public ExamCollection getExamData() {
		return examData;
	}
	public void setExamData(ExamCollection examData) {
		this.examData = examData;
	}
	public Map<String, Integer> getAddress() {
		return address;
	}

	public void setAddress(Map<String, Integer> address) {
		this.address = address;
	}
	
	

	@Override
	public String toString() {
		return "StudentCollection [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	
}
