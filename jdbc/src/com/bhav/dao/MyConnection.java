package com.bhav.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection {
	public static void getConnection() {
	      try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?characterEncoding=utf8",
	                    "root", "Bhavna@123");
	            Statement stmt = con.createStatement();
	            ResultSet rs = stmt.executeQuery("select * from company");
	            while (rs.next())
	                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + " "
	                        + rs.getString(4) + " " + rs.getString(5));
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	}
}
