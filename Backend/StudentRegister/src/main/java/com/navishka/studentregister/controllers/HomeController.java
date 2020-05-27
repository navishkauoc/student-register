package com.navishka.studentregister.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	public String index() {
		return "Welcome to Student Register Application";
	}

}
