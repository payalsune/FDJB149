package com.cjc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;

@RestController
public class HomeController {

	
	
	@RequestMapping("/")
	public Student prelogin()
	{
		System.out.println("This is IT department");
		Student s=new Student();
		s.setId(111);
		s.setName("AAA");
		s.setAddress("Pune");
		
		return s;
	}
}
