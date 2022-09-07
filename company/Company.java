package com.company;

public class Company {
	
	int cId;
	String name;
	String city;
	int turnover;
	int empno;
	
	public Company(int cId, String name, String city, int turnover, int empno) {
		super();
		this.cId = cId;
		this.name = name;
		this.city = city;
		this.turnover = turnover;
		this.empno = empno;
	}
	public Company() {
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	
	public void display() {
		System.out.println(cId+" "+ name+ " "+ " "+ city+ " "+ turnover + " "+ empno);
	}
	
	
	

}
