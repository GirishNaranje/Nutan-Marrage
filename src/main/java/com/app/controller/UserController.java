
package com.app.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Cart;
import com.app.pojos.User;
import com.app.service.IAdminService;
import com.app.service.IProductService;
import com.app.service.IUserService;


@Controller
@RequestMapping("/user")

public class UserController {
	
	@Autowired 
	private IUserService userService;
	
	@Autowired
	private IAdminService adminService;
	
	@Autowired
	private IProductService productService;
	
    public UserController() {
		System.out.println("in the ctor of "+getClass().getName());
	}
	
	@GetMapping("/register")
	public String showRegisterUserForm(Model map)
	{
		map.addAttribute("user_details", new User());
		return "/user/register";
	}
	
	@PostMapping("/register")
	public String registerUserForm(@Valid User user,BindingResult result,RedirectAttributes flashMap, HttpSession session)
	{
		session.setAttribute("user_details", user);
		flashMap.addFlashAttribute("message", userService.registerUser(user));
		return "redirect:/user/login";
	}
	
	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/user/login";
	}
	
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email,@RequestParam String password,Model map,HttpSession session) 
	{
	    System.out.println("in process login form "+email+" "+password);
	    try {
	    	User validatedUser=userService.authenticateUser(email,password);
	    	System.out.println("after validation");
	    	session.setAttribute("message", validatedUser + "login successfull...");
	    	Cart cart=new Cart();
	    	session.setAttribute("cart", cart);
	    	}catch (RuntimeException e) {
			map.addAttribute("message", "Invalid Login, Please Retry");
			 return "/user/login";
			}
	      return "/user/details";
     }
	
	@GetMapping("/logout")
  	public String logout(HttpSession session,Model map,HttpServletRequest request,HttpServletResponse resp)
  	{
  		System.out.println("in logout "+map);
  		//get user details from session scope n add it under current request scope
  		map.addAttribute("details",session.getAttribute("user_dtls"));
  		//invalidate session
  		session.invalidate();
  		//How to auto navigate the clnt to the next page (eg : home page) after a dly ?
  		//Method of HttpServletRespose : public void setHeader(String name,String value)
  		//resp.setHeader("refresh", "5;url="+request.getContextPath());
  		return "redirect:/user/logout";//actual view name /WEB-INF/views/user/logout.jsp 
  	}
	
	 @GetMapping("/delete")
	public String deleteUserDetails(HttpSession hs, @RequestParam int uid, RedirectAttributes flashMap) {
		Integer id = (Integer) hs.getAttribute("uid");
		System.out.println("in delete user details " + uid);
		 userService.deleteUser(uid);
		flashMap.addFlashAttribute("message");
		return "redirect:/admin/list";
	}
	  
	  @GetMapping("/product_list")
	  public String listProducts(Model map) {
	  System.out.println("in list product...");
	  map.addAttribute("product_list",productService.findAllProducts1());
	  return"/admin/product_list"; 
	  }
	  
	  
		@RequestMapping("/AboutUs")
		public String AboutUs()
		{
			System.out.println("in aboutus page");
			return "navbar/AboutUs";
		}
	  
	  
}

