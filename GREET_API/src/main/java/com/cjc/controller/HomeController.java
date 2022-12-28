package com.cjc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/greet")
	public String prelogin()
	{
		return "Welcome greet api.....";
	}
}
