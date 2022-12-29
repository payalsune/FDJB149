package com.cjc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Student;
import com.cjc.service.HomeService;

@Controller
public class HomeController {

	@Autowired
	HomeService hs;
	
	//this is Controller
	
	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}
	
	@RequestMapping("/registration")
	public String preregister()
	{
		return "registration";
	}
	
	@RequestMapping("/reg")
	public String registerData(@ModelAttribute Student s)
	{
		hs.saveData(s);
		return "login";
	}
	
	@RequestMapping("/login")
	public String logincheck(@RequestParam("uname")String un,@RequestParam("password")String ps,ModelMap m)
	{
		hs.logincheck(un,ps);
		List<Student>list=hs.displayAllData();
		m.addAttribute("data", list);
		return "success";
		
	}
	
	@RequestMapping("/delete")
	public String deletepage(@RequestParam("uid")int uid,ModelMap m)
	{
		hs.deleteData(uid);
		List<Student>list=hs.displayAllData();
		m.addAttribute("data", list);
		return "success";
	}
	
	@RequestMapping("/edit")
	public String editPage(@ModelAttribute Student s, ModelMap m)
	{
		Student st=hs.editData(s);
		m.addAttribute("data", st);
		return "edit";

	}
	@RequestMapping("/regedit")
	public String updatepage(@ModelAttribute Student s,ModelMap m)
	{
		hs.updateData(s);
		List<Student> list=hs.displayAllData();

		
		
			m.addAttribute("data", list);
			return "success";
	}
}
