package com.app.service;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IProductDao;
import com.app.pojos.Product;


@Service
@Transactional
public class ProductServiceImpl implements IProductService {
	@Autowired
	private IProductDao productDao;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		System.out.println("in product service impl");
		return productDao.save(product);
	}

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public void deleteProduct(Integer Id) {
		// TODO Auto-generated method stub
		 productDao.deleteById(Id);
		
	}

	
	  @Override public List<Product> findAllProducts1() {
		  // TODO Auto-generated  method stub
	     return productDao.findAll(); 
	  }

	@Override
	public void addCart(int pid) {
	
		
	}

		/*
		 * @Override public void addCart(int pid) { // TODO Auto-generated method stub
		 * return productDao.findAll();
		 * 
		 * }
		 */
	 
}
