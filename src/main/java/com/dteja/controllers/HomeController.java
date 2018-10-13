package com.dteja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String show() {
		return "index";
	}

	@RequestMapping("/index")
	public String showindex() {
		return "index";
	}

	

	@RequestMapping("/login")
	public String showlogin() {
		return "LoginPage";

	}
	@RequestMapping("/register")
	public String showregister() {
		return "RegisterPage";

	}

}
