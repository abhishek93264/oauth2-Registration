package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
		
	@RequestMapping("/list")
	public String viewHomePage() {
		return "index";
	}	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}	
}
