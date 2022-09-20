//package com.DPhonecorp;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//
//public class InsertRefData {
//
//	public static void addData() throws Exception {
//
//		Referral ref1 = new Referral("125e", "Daksh", "8627024573");
//		Referral ref2 = new Referral("127e", "Dilshan", "9817024573");
//		Referral ref3 = new Referral("193e", "Aryaman", "9910065178");
//		Referral ref4 = new Referral("103e", "Rohit", "9810014573");
//		Referral ref5 = new Referral("173e", "Akash", "9711994573");
//
//		File f1 = new File(
//				"C:\\Users\\Ekjot.Makol\\eclipse-workspace\\Assesment3\\src\\com\\DPhonecorp\\ReferralData.txt");
//		FileOutputStream fout = new FileOutputStream(f1);
//		ObjectOutputStream oos = new ObjectOutputStream(fout);
//		oos.writeObject(ref1);
//		oos.writeObject(ref2);
//		oos.writeObject(ref3);
//		oos.writeObject(ref4);
//		oos.writeObject(ref5);
//		System.out.println("Data Stored");
//
//	}
//}
