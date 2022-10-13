package com.bhavna.referral.dao;

import java.util.ArrayList;
import java.util.List;

import com.bhavna.referral.bean.Referral;

public class ReferralDao {

	List<Referral> list = new ArrayList();
	Referral ref1 = new Referral("Ekjot", "8927026876", 24, "e234");
	Referral ref2 = new Referral("Ram", "8927067851", 30, "f234");
	Referral ref3 = new Referral("Hisham", "9810097168", 27, "h123");
	Referral ref4 = new Referral("Daksh", "8927026456", 21, "m234");

	public List<Referral> add() {
		list.add(ref1);
		list.add(ref2);
		list.add(ref3);
		list.add(ref4);
		for (Object b : list) {
			System.out.println(b);
		}
		return list;
	}
}
