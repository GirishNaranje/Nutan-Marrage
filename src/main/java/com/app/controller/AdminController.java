package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.dao.IAdminDao;
import com.app.pojos.Admin;
import com.app.service.IAdminService;
import com.app.service.IProductService;
import com.app.service.IUserService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private IAdminService adminService;
	
	@Autowired
	private IProductService productService;

	
	public AdminController() {
		System.out.println("in ctor of "+getClass().getName());
	}
	@GetMapping("/details")
	public String showAdminDetails()
	{
		System.out.println("in show admin details");
		return"/admin/admin_details";//to forward view-->actual view name
	}

	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/admin/login";
	}

	// adding request handling method to process the form
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, @RequestParam String password, Model map,
			HttpSession session) {
		System.out.println("in process login form " + email + " " + password);
		try {
			Admin validatedAdmin = adminService.authenticateAdmin(email, password);
			System.out.println("validatedAdmin"+validatedAdmin);
			session.setAttribute("message", validatedAdmin );
            return "admin/detail";

		} catch (RuntimeException e) {
			map.addAttribute("message", "Invalid Login, Please Retry");
			return "admin/login";
		}
	}
	
	
	
	@GetMapping("/list")
	  public String listUsers(Model map) {
	  System.out.println("in list users...");
	  map.addAttribute("user_list",userService.findAllUsers());
	  return"/admin/list"; 
	  }
	
	 @GetMapping("/pro_list")
	  public String listProducts(Model map) {
	  System.out.println("in list product...");
	  map.addAttribute("product_list",productService.findAllProducts());
	  return"/admin/pro_list"; 
	  }
	 
	 
}














