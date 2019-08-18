package com.cts.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.user.DAO.userDAO;
import com.cts.user.pojo.User;

@Service
public class userService {
	
	 

		userDAO userdao=new userDAO();
	 
	 public  void addUser(User user)
		{
		  userdao.addUser(user);
		}
	
	

}
