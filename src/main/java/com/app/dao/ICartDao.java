
  package com.app.dao;
  
  import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Cart;
import com.app.pojos.Product;
  
  public interface ICartDao extends JpaRepository<Cart, Integer> {

	
	  
  
  }
 