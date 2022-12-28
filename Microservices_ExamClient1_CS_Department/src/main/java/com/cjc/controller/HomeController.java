package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@Autowired
	RestTemplate rt;
	
	@RequestMapping("/getConCSExam")
	public List prelog()
	{
		String url="http://localhost:9091/getProCS";
		List lt=rt.getForObject(url,List.class);
		return lt;
	}
}
