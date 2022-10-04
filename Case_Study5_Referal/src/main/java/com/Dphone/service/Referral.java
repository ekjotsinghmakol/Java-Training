package com.Dphone.service;

public class Referral {
	String referralCode;
	String name;
	String phonenumber;
	int bonus;

	public Referral(String referralCode, String name, String phonenumber, int bonus) {
		super();
		this.referralCode = referralCode;
		this.name = name;
		this.phonenumber = phonenumber;
		this.bonus = bonus;

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

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Referral [referralCode=" + referralCode + ", name=" + name + ", phonenumber=" + phonenumber + "]";
	}
	
	
}
