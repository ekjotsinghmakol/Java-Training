package com.bhav.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.bhav.bean.Company;

public class EmployeeDao {
	public int addCompany(Company company) {
		int i = 0;
		Statement statement = null;
		Connection connection = null;
		try {
			String connectionString = "jdbc:mysql://localhost:3306/company";
			connection = DriverManager.getConnection(connectionString,"root","Bhavna@123");
			statement = connection.createStatement();
			int vcid = company.getcId();
			String vName = company.getcName();
			int vTurnOver = company.getTurnover();
			String vAdress = company.getAddress();
			String vDate = company.getDateOfest();
			String sql = "INSERT INTO COMPANY VALUES(119,'KPMG',20000000,'BANGLORE','1998-12-11')";
			
			i = statement.executeUpdate(sql);
		} catch(Exception e) {
			System.out.println(e);
		}
		return i;
	}

		
	}

