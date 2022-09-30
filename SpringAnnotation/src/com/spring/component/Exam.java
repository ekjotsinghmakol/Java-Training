package com.spring.component;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.student.component.Student;

@Component("examobject")
public class Exam {

	@Value("101")
	int eId;
	@Value("Java")
	String name;
	@Value("90")
	double marks;
	@Value("#{Examlist.branches}")
	List<String> branches;
	@Value("#{Examlist.records}")
	Map<String, Integer> records;
	Student student;

	public Exam() {
	}

	public Exam(int eId, String name, double marks, List<String> branches, Map<String, Integer> records) {
		super();
		this.eId = eId;
		this.name = name;
		this.marks = marks;
		this.branches = branches;
		this.records = records;
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

	public Map<String, Integer> getRecords() {
		return records;
	}

	public void setRecords(Map<String, Integer> records) {
		this.records = records;
	}
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Exam [eId=" + eId + ", name=" + name + ", marks=" + marks + ", branches=" + branches + ", records="
				+ records + "]";
	}

}
