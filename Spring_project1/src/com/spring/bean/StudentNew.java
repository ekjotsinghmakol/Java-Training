package com.spring.bean;

public class StudentNew {
	int rollNo;
	String name;
	int salary;
	Exam exam;
	
	public StudentNew() {}
	
	public StudentNew(int rollNo, String name, int salary, Exam exam) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.salary = salary;
		this.exam = exam;
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

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "StudentNew [rollNo=" + rollNo + ", name=" + name + ", salary=" + salary + ", exam=" + exam + "]";
	}
	
	
	
	
	
	
}
