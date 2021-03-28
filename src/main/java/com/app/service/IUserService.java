package com.app.service;

import java.util.List;

import com.app.pojos.User;

public interface IUserService {
	 
	User registerUser(User user);
	
	public User authenticateUser(String email,String password);
	
    public List<User> findAllUsers() ;
    
    void deleteUser(Integer Id);
	  
	/* void deleteBy(Integer Id); */
	 
	
}

