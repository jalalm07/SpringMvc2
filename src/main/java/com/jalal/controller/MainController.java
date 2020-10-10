package com.jalal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/show")
	@ResponseBody
	public String show() {
		System.out.println("inside show....");
		return "Hello world";
	}
	
}
