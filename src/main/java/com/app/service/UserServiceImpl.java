package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.User;

@Service // to tell SC below class is BL supplier
@Transactional // handle transaction automatically
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

	@Override
	public User authenticateUser(String email, String password) {
		// TODO Auto-generated method stub
		return userDao.findByEmailAndPassword(email, password);
	}

	
	  @Override public List<User> findAllUsers() {
		  // TODO Auto-generated method
	      return userDao.findAll(); 
	  }
	  
	  

		@Override
		public void deleteUser(Integer Id) { // TODO Auto-generated method
			userDao.deleteById(Id);
		}
	
		

}