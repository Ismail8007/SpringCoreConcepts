package com.example.demo;

import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVsParamController {
	
	
	//http://locallhost:8080/test/876
	@GetMapping("/test/{id}")
	public Integer test(@PathVariable Integer id) {
		return id;
	}
	
	
	//http://localhost:8080/test1?id=128
	
	@GetMapping("/test1")
	public Integer test1(@RequestParam Integer id) {
		return id;
	}
	
	//http://localhost:8080/test2/12,34
	@GetMapping("/test2/{ids}")
	public String test2(@PathVariable Integer[] ids) {
		
		return Arrays.toString(ids);
	}
	
	//http://localhost:8080/test3?ids=13,89
	@GetMapping("/test3")
	public String test3(@RequestParam Integer[] ids) {
		
		return Arrays.toString(ids);
	}

}
