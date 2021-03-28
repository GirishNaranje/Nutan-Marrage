package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
	public HomePageController() {
		System.out.println("in ctor of "+getClass().getName());
	}
//	@RequestMapping(name="/show")
	@RequestMapping("/show")
	public String showHomePage()
	{
		System.out.println("in show home page");
		return "/index";
	}
	
	
	@RequestMapping("/AboutUs")
	public String AboutUs()
	{
		System.out.println("in about page");
		return "navbar/AboutUs";
	}

	@RequestMapping("/Contact")
	public String Contact()
	{
		System.out.println("in Contact page");
		return "navbar/Contact";
	}
}
