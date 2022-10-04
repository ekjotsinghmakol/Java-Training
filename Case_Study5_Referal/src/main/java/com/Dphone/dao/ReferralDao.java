package com.Dphone.dao;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Dphone.service.MyConnection;
import com.Dphone.service.Referral;

public class ReferralDao {

//	public int addReferral(Referral ref) {
//		int i = 0;
//		Statement statement = null;
//		Connection connection = null;
//		try {
//			connection = MyConnection.getConnection();
//			statement = connection.createStatement();
//			String rId = ref.getReferralCode();
	
//			String rName = ref.getName();
//			String rnumber = ref.getPhonenumber();
//			int bonus = ref.getBonus();
//			String sql = "INSERT INTO  Referral VALUES('e7892','Raj','9910067185',2000)";
//			i = statement.executeUpdate(sql);
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return i;
//	}
	public int addReferral(String referralCode, String name, String phoneNumber, int bonus) {
		int i = 0;
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			PreparedStatement stmt = connection.prepareStatement("insert into Referral values(?,?,?,?)");
			stmt.setString(1, referralCode);
			stmt.setString(2, name);
			stmt.setString(3, phoneNumber);
			stmt.setInt(4, bonus);
			i = stmt.executeUpdate();
			System.out.println("record has been added");

		} catch (Exception ex) {
			System.out.println("IOException is caught " + ex);
		}
		return i;
	}

	public int viewReferral(Referral ref) {
		int i = 0;
		Statement statement = null;
		Connection connection = null;
		try {
			connection = MyConnection.getConnection();
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from Referral");
			while (rs.next())
				System.out.println(
						rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + " " + rs.getInt(4));

		} catch (Exception e) {
			System.out.println(e);
		}
		return i;
	}

	public void deleteReferral(Referral ref) {
		Connection connection = null;
		connection = MyConnection.getConnection();
		Statement stmt;
		try {
			stmt = connection.createStatement();
//	        ResultSet rs = stmt.executeQuery("delete from Referral where name =+'"name);
			int delete = stmt.executeUpdate("delete from Referral where name = 'Nitin'");
			System.out.println("Deleted successfully");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void editReferral(Referral ref) {
		Connection connection = null;
		connection = MyConnection.getConnection();
		Statement stmt;
		try {
			stmt = connection.createStatement();

			int edit = stmt.executeUpdate("update Referral SET name = 'Daksh' where phonenumber = ' 7810076212'");
			System.out.println("Edited successfully");
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
