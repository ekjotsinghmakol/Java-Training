package com.DPhonecorp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Referral implements Serializable {

	String referralCode;
	String name;
	String phonenumber;

	// CONSTRUCTOR
	public Referral(String referralCode, String name, String phonenumber) {
		super();
		this.referralCode = referralCode;
		this.name = name;
		this.phonenumber = phonenumber;

	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	// DEFAULT CONSTRUCTOR
	public Referral() {
	}

	List<Referral> listReferral = new ArrayList<Referral>();

	// METHOD TO REFER FRIENDS USING AN ARRAY LIST AND THEN STORING THE DATA
	public void referralInput() {
		try (Scanner sc = new Scanner(System.in)) {

			Referral ref1 = new Referral("125e", "Akshay", "8627024573");
			Referral ref2 = new Referral("127e", "Dilshan", "9817024573");
			Referral ref3 = new Referral("193e", "Aryaman", "9910065178");
			Referral ref4 = new Referral("103e", "Rohit", "9810014573");
			Referral ref5 = new Referral("173e", "Akash", "9711994573");
			System.out.println("Enter number of referrals: ");
			int n = sc.nextInt();

			// CHOICE NUMBER
			if (n == 1) {

				listReferral.add(ref1);
				Iterator<Referral> iterator1 = listReferral.iterator();

				System.out
						.println("You referred to 1 of your most frequently contacted friend and gained 1000 points\n");

				while (iterator1.hasNext()) {
					Referral ref = (Referral) iterator1.next();
					System.out.println(ref.referralCode + " " + ref.name + " " + ref.phonenumber);
				}
				int bonus = 1000;

				// STORING REF1 INTO FILE ---> SERIALIZING
				File f1 = new File(
						"C:\\Users\\Ekjot.Makol\\eclipse-workspace\\Assesment3\\src\\com\\DPhonecorp\\ReferralData.txt");
				FileOutputStream fout = new FileOutputStream(f1);
				try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
					oos.writeObject(ref1);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else if (n == 2) {

				listReferral.add(ref1);
				listReferral.add(ref2);
				System.out.println(
						"You referred to 2 of your most frequently contacted friends and gained 2000 points\n");
				Iterator<Referral> iterator1 = listReferral.iterator();
				while (iterator1.hasNext()) {
					Referral ref = (Referral) iterator1.next();
					System.out.println(ref.referralCode + " " + ref.name + " " + ref.phonenumber);
				}
				int bonus = 2000;

				// STORING REF1 & REF2 INTO FILE---> SERIALIZING
				File f1 = new File(
						"C:\\Users\\Ekjot.Makol\\eclipse-workspace\\Assesment3\\src\\com\\DPhonecorp\\ReferralData.txt");
				FileOutputStream fout = new FileOutputStream(f1);
				try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
					oos.writeObject(ref1);
					oos.writeObject(ref2);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else if (n == 3) {

				listReferral.add(ref1);
				listReferral.add(ref2);
				listReferral.add(ref3);

				System.out.println(
						"You referred to 3 of your most frequently contacted friends and gained 3000 points\n");

				Iterator<Referral> iterator1 = listReferral.iterator();
				while (iterator1.hasNext()) {
					Referral ref = (Referral) iterator1.next();
					System.out.println(ref.referralCode + " " + ref.name + " " + ref.phonenumber);
				}
				int bonus = 3000;

				// STORING REF1 REF2 & REF3 INTO FILE
				File f1 = new File(
						"C:\\Users\\Ekjot.Makol\\eclipse-workspace\\Assesment3\\src\\com\\DPhonecorp\\ReferralData.txt");
				FileOutputStream fout = new FileOutputStream(f1);
				try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
					oos.writeObject(ref1);
					oos.writeObject(ref2);
					oos.writeObject(ref3);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else if (n == 4) {

				listReferral.add(ref1);
				listReferral.add(ref2);
				listReferral.add(ref3);
				listReferral.add(ref4);

				System.out.println(
						"You referred to 4 of your most frequently contacted friends and gained 4000 points\n");

				Iterator<Referral> iterator1 = listReferral.iterator();
				while (iterator1.hasNext()) {
					Referral ref = (Referral) iterator1.next();
					System.out.println(ref.referralCode + " " + ref.name + " " + ref.phonenumber);
				}
				int bonus = 4000;

				// STORING REF1 REF2 REF3 & REF4 INTO FILE
				File f1 = new File(
						"C:\\Users\\Ekjot.Makol\\eclipse-workspace\\Assesment3\\src\\com\\DPhonecorp\\ReferralData.txt");
				FileOutputStream fout = new FileOutputStream(f1);
				try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
					oos.writeObject(ref1);
					oos.writeObject(ref2);
					oos.writeObject(ref3);
					oos.writeObject(ref4);
				} catch (Exception e) {
					System.out.println(e);
				}

			} else {

				listReferral.add(ref1);
				listReferral.add(ref2);
				listReferral.add(ref3);
				listReferral.add(ref4);
				listReferral.add(ref5);

				System.out.println(
						"You referred to 5 of your most frequently contacted friends and gained 5000 points\n");
				Iterator<Referral> iterator1 = listReferral.iterator();
				while (iterator1.hasNext()) {
					Referral ref = (Referral) iterator1.next();
					System.out.println(ref.referralCode + " " + ref.name + " " + ref.phonenumber);
				}
				int bonus = 5000;

				// STORING REF1 REF2 REF3 REF4 & REF5 INTO FILE
				File f1 = new File(
						"C:\\Users\\Ekjot.Makol\\eclipse-workspace\\Assesment3\\src\\com\\DPhonecorp\\ReferralData.txt");
				FileOutputStream fout = new FileOutputStream(f1);
				try (ObjectOutputStream oos = new ObjectOutputStream(fout)) {
					oos.writeObject(ref1);
					oos.writeObject(ref2);
					oos.writeObject(ref3);
					oos.writeObject(ref4);
					oos.writeObject(ref5);
				} catch (Exception e) {
					System.out.println(e);
				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("data is stored in RefData.txt");
	}

	public void viewData() {
//		Referral ref1 = new Referral("125e", "Daksh", "8627024573");
//		Referral ref2 = new Referral("127e", "Dilshan", "9817024573");
//		Referral ref3 = new Referral("193e", "Aryaman", "9910065178");
//		Referral ref4 = new Referral("103e", "Rohit", "9810014573");
//		Referral ref5 = new Referral("173e", "Akash", "9711994573");
//		
//		listReferral.add(ref1);
//		listReferral.add(ref2);
//		listReferral.add(ref3);
//		listReferral.add(ref4);
//		listReferral.add(ref5);
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					"C:\\Users\\Ekjot.Makol\\eclipse-workspace\\Assesment3\\src\\com\\DPhonecorp\\ReferralData.txt"));
			Referral ref1 = (Referral) in.readObject();
			// printing the data of the serialized object
			System.out.println(ref1.name + " " + ref1.referralCode + " " + ref1.phonenumber);
			// closing the stream
			in.close();

			System.out.println("Object has been deserialized ");
		} catch (Exception e) {
			System.out.println(e);
		}
//
//		Iterator<Referral> itr = listReferral.iterator(); // Iterator
//		while (itr.hasNext()) {// check if iterator has the elements
//			Referral view = (Referral) itr.next();
//			System.out.println("Name:" + view.getName() + " " + "Mobile No.: " + view.getPhonenumber() + " "
//					+ "ReferralCode: " + view.getReferralCode() + " ");
//
//		}
	}

	public void deleteData() {
		listReferral.removeAll(listReferral);
	}
}
