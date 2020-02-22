package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String index() {
		System.out.println("abc!!");
		System.out.println("Hello!!");
		System.out.println("World!!!");
		System.out.println("12");

		String msg = "success";
		return msg;
	}

}
