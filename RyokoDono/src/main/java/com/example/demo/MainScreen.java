package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainScreen {

	@RequestMapping("/MainScreen")
	public String start() {
		return "test.html";
		
	}
	//http://localhost:8080/MainScreen
	
}
