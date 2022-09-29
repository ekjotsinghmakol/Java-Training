package com.spring.bean;

import java.util.List;

public class ExamCollection {
	int eId;
	String name;
	double marks;
	List <String> branches;
	
	public ExamCollection() {}
	public ExamCollection(int eId, String name, double marks, List<String> branches) {
		super();
		this.eId = eId;
		this.name = name;
		this.marks = marks;
		this.branches = branches;
	}
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
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public List<String> getBranches() {
		return branches;
	}
	public void setBranches(List<String> branches) {
		this.branches = branches;
	}
	@Override
	public String toString() {
		return "ExamCollection [eId=" + eId + ", name=" + name + ", marks=" + marks + ", branches=" + branches + "]";
	}
	
	
}
