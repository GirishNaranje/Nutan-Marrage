package com.app.controller;

import javax.servlet.http.HttpSession;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Product;
import com.app.service.IAdminService;
import com.app.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	
	
	@Autowired
	private IProductService productService;
	
	@Autowired
	private IAdminService adminService;
	
	public ProductController() {
		System.out.println("in the ctor of "+getClass().getName());
	}
	
	@GetMapping("/add_product")
	public String showAddProductForm(Model map)
	{
		System.out.println("in show add product form");
		map.addAttribute("product",new Product());
		return"/product/add_product";
	}
	
	@PostMapping("/add_product")
	public String addProductForm(@ModelAttribute Product product,BindingResult result,RedirectAttributes flashMap,
			HttpSession session)
	{
		System.out.println("in add product form");
	session.setAttribute("product_details",product);	
	System.out.println("in show add product form after session");
	flashMap.addFlashAttribute("message",productService.addProduct(product));
	System.out.println("in show add product form after save method");
	return "redirect:/admin/login";
	}
	
	
	 
	@GetMapping("/delete")
	public String deleteProductDetails(HttpSession hs, @RequestParam int pid, RedirectAttributes flashMap) {
		Integer id = (Integer) hs.getAttribute("pid");
		System.out.println("in delete product details " + id);
	    productService.deleteProduct(id);
		flashMap.addFlashAttribute("message");
		return "redirect:/admin/pro_list";
	}
	
	@PostMapping("/addtocart")
	public String addToCart(HttpSession hs,@RequestParam int pid,RedirectAttributes flashMap) {
		Integer id=(Integer)hs.getAttribute("pid");
		System.out.println("in add to cart process" +pid);
		productService.addCart(pid);
		flashMap.addFlashAttribute("message");
		return"redirect:/user/product_list";
	}
}
