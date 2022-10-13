package com.bhavna.referral.controller;

import com.bhavna.referral.bean.Referral;
import com.bhavna.referral.dao.ReferralDao;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String welcomeReferral() {

		return "register";
	}

	@RequestMapping("/display")
	public String display(@RequestParam("name") String name, @RequestParam("mobile") String mobile,
			@RequestParam("age") int age, @RequestParam("referralCode") String referralCode, Model model) {
		Referral referral = new Referral();
		referral.setName(name);
		referral.setMobile(mobile);
		referral.setAge(age);
		referral.setReferralCode(referralCode);

		System.out.println(referral);

		if (age < 18) {
			String msg = name + " is not qualified as a referral";
			model.addAttribute("referral1", referral);
			model.addAttribute("errorMessage", msg);
			return "failed";
		} else {
			String msg = name + " is qualified as a referral";
			model.addAttribute("name1", referral.getName());
			model.addAttribute("mobile1", referral.getMobile());
			model.addAttribute("age1", referral.getAge());
			model.addAttribute("referralCode1", referral.getReferralCode());
			model.addAttribute("message", msg);
			return "sucess";
		}

		
	}
	@RequestMapping("/viewall")
	public String viewReferral(Model m,ReferralDao dao) {
		List<Referral> list = dao.add();
		m.addAttribute("list",list);		
		System.out.println("in");
		return "viewall";
	}

}
