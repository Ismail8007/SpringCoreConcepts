package com.springbytes.exampl_18.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	 @RequestMapping(value={"", "/", "home"})
	public  String sayHello(Model model) {
		model.addAttribute("username","Ismail");
		return "home.html";
	}

}
