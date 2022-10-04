package com.Dphone.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection {
	public static Connection getConnection() {
		Connection connect = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded,Registered and connected");

			String connectionString = "jdbc:mysql://localhost:3306/Dphonecorp2";
			connect = DriverManager.getConnection(connectionString, "root", "Bhavna@123");
			System.out.println("Connected");

//			Statement stmt = connect.createStatement();
//			ResultSet rs = stmt.executeQuery("select * from Referral");
//			while (rs.next())
//				System.out.println(
//						rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getInt(4));
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connect;
	}

	public static Statement createStatement() {
		// TODO Auto-generated method stub
		return null;
	}

}
