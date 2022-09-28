package com.bhav.bean;

import java.sql.Date;

public class Company {
	int cId;
	String cName;
	int turnover;
	String address;
	String dateOfest;
	
	public Company(int cId, String cName, int turnover, String address, String dateOfest) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.turnover = turnover;
		this.address = address;
		this.dateOfest = dateOfest;
	}


	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getTurnover() {
		return turnover;
	}

	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDateOfest() {
		return dateOfest;
	}

	public void setDateOfest(String dateOfest) {
		this.dateOfest = dateOfest;
	}
	
	
	
	
	
}
