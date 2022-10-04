package com.Dphone.tester;

import java.util.Scanner;

import com.Dphone.dao.ReferralDao;
import com.Dphone.service.MyConnection;
import com.Dphone.service.Referral;
import com.Dphone.service.RegisterLogin;

public class TestDphonecorp {

	public static void main(String[] args) {
		System.out.println(
				"login/Register -->1  ViewReferral -->2  AddReferral -->3  DeleteReferral -->4  UpdateReferral -->5");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();

		MyConnection con = new MyConnection();
		con.getConnection();

		RegisterLogin newUser = new RegisterLogin();
		ReferralDao rnew = new ReferralDao();

		if (choice == 1) {
			newUser.userRegistration();
			newUser.userLogin();
		}

		if (choice == 2) {
			rnew.viewReferral(null);
		}
		if (choice == 3) {
			rnew.addReferral("e789", "Nitin", "9810076185", 3000);
//			rnew.addReferral("e800", "Aman", "7810076185", 2000);
//			rnew.addReferral("e290", "Harsh", "8910076185", 1000);
		}
		if (choice == 4) {
			rnew.deleteReferral(null);
		}
		if (choice == 5) {
			ReferralDao edit = new ReferralDao();
		    edit.editReferral(null);
		}

	}

}
