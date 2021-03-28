package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.pojos.User;
@EnableJpaRepositories
public interface IUserDao extends JpaRepository<User, Integer> {

	 User findByEmailAndPassword(String email,String password);

	 //this are inbuilt function declared in JPA repo so no need to declare explicitly here
	 //List<User> listAllUsers();
	 //User deleteBy(Integer Id);
		 
}
