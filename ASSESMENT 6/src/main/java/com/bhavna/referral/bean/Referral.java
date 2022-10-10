package com.bhavna.referral.bean;

public class Referral {
	String name;
	String mobile;
	int age;
	String referralCode;

	public Referral() {
	}

	public Referral(String name, String mobile, int age, String referralCode) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.age = age;
		this.referralCode = referralCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}

	@Override
	public String toString() {
		return "Referral [name=" + name + ", mobile=" + mobile + ", age=" + age + ", referralCode=" + referralCode
				+ "]";
	}

}
