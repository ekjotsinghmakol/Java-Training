package com.bhavna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping(value = "/display.html")
	public String display() {
		return "welcome1.jsp";

	}
}
