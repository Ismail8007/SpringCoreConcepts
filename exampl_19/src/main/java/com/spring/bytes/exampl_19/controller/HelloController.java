package com.spring.bytes.exampl_19.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/home")
	public String displayHome() {
		return "home.html";
	}

}
