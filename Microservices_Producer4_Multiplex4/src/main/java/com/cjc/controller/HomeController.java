package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Shows;
import com.cjc.service.HomeService;

@RestController
public class HomeController {

	@Autowired
	HomeService hs;
	
	@RequestMapping("/getpromultiplex4")
	public String prelogin()
	{
		return "Welcome to Multiplex 4";
	}
	
	@RequestMapping(value = "/save4",method = RequestMethod.POST)
	public Shows saveShow(@RequestBody Shows s)
	{
		hs.saveData(s);
		return s;
	}
	
	@RequestMapping(value ="/getAll4",method = RequestMethod.GET )
	public Iterable<Shows> getShowsData()
	{
		return hs.getAllData();
	}
	
	@RequestMapping(value = "/deletebyid4/{id}",method = RequestMethod.DELETE)
	public String deleteShow(@PathVariable("id")int id)
	{
		hs.deleteShowData(id);
		return "deleted successfully";
	}
	
	@RequestMapping(value = "/update4",method = RequestMethod.PUT)
	public String updateShow(@RequestBody Shows s)
	{
		hs.saveData(s);
		return "updated";
	}
}
