
  package com.app.controller;
  
  import java.util.ArrayList; import java.util.List;
  
  import javax.servlet.http.HttpSession;
  
  import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import
  org.springframework.stereotype.Controller; import
  org.springframework.web.bind.annotation.GetMapping; import
  org.springframework.web.bind.annotation.RequestMapping; import
  org.springframework.web.bind.annotation.RequestParam; import
  org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Cart;
import com.app.pojos.Product; import com.app.service.ICartService; import
  com.app.service.IProductService; import com.app.service.ProductServiceImpl;
  
  @Controller
  
  @RequestMapping("/cart")
  public class CartController {
  
  @Autowired
  private IProductService productService;
  
  @Autowired
  private ICartService cartService;
  
  @GetMapping("/addtocart") 
	  public String addToCart(HttpSession hs, @RequestParam int cid, RedirectAttributes flashMap) {
	  List<Integer>cart=(List<Integer>)hs.getAttribute("cart");
	  cart.add(cid);
	  Integer id = (Integer) hs.getAttribute("cid");
	  System.out.println("in addtocart  " + id);
	  flashMap.addFlashAttribute("message");
	  return "redirect:/product/addtocart";
	  }
	  
  @GetMapping("/showcart") 
	  public String showCart(HttpSession session) {
	 Cart cart=(Cart)session.getAttribute("cart");
	  List<Product> products =cart.getProductId();
	  double total = 0;
	  for (Product p: products) 
	  {
		 total += p.getPrice();
	  }
      session.setAttribute("price",  total); 
	  return "/product/showcart"; 
	  }
	 
}

