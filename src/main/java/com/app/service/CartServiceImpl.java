
  package com.app.service;
  
  import java.util.List;
  
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service; import
  org.springframework.transaction.annotation.Transactional;
  
  import com.app.dao.ICartDao; import com.app.pojos.Product;
  
  
  
  @Service
  
  @Transactional 
  public class CartServiceImpl implements ICartService {
  
  @Autowired
  private ICartDao cartDao;
  
  @Override
  public List<Product> getProductByCart()
  {
	  return cartDao.findByProductId();
  }
 // @Override 
  //public List<Product> getProductByCart(int cart) 
  //{
	  // TODOAuto-generated method stub
	 // return null;
	  //}



@Override
public Product getById(Integer id) {
	// TODO Auto-generated method stub
	return null;
}
  
  
  }
  
  
  
 