package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test3Controller {
	
	@GetMapping("/")
	public String index() {
		System.out.println("강의실 작업");
		return "index";
	}
}
