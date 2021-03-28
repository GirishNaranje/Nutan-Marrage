
  package com.app.service;
  
  import java.util.List;
  
  import com.app.pojos.Product;
  
  public interface ICartService {
  
  List<Product> getProductByCart(int cart);
  
  Product getById(Integer id); 
  
  }
 