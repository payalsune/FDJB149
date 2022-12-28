package com.cjc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cjc.model.Shows;

@CrossOrigin("*")
@RestController
public class HomeController {

	@Autowired
	RestTemplate rt;

	
	 @RequestMapping("/getconbookmyshow") 
	 public String consumer()
	 { 
		 return "welcome book my show";
		 
	 }
	 
	 @RequestMapping(value ="/getAllData",method = RequestMethod.GET)
	public List<Shows> prelogin()
	{
		String url1="http://localhost:9091/getAll1";
		List<Shows>st1=rt.getForObject(url1,List.class);
		
		String url2="http://localhost:9092/getAll2";
		List<Shows>st2=rt.getForObject(url2,List.class);
		
		String url3="http://localhost:9093/getAll3";
		List<Shows>st3=rt.getForObject(url3,List.class);
		
		String url4="http://localhost:9094/getAll4";
		List<Shows>st4=rt.getForObject(url4,List.class);
		
		List<Shows>list=new ArrayList<Shows>();
		list.addAll(st1);
		list.addAll(st2);
		list.addAll(st3);
		list.addAll(st4);
		
		return list;
		
		
		
	}
}
