package com.cts.user.input;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.user.pojo.User;
import com.cts.user.service.userService;

public class userInput {
	Scanner s=new Scanner(System.in);
	User user=new User();
	
	
	
	public userInput() {
		super();
		// TODO Auto-generated constructor stub
	}

	//@Autowired
	 userService uService =new userService();

	public void input() {
		System.out.println("Enter firstName");
		 user.setFirstName(s.next());
		 System.out.println("Enter lastName");
		user.setLastName(s.next());
		System.out.println("Enter userName");
		user.setUserName(s.next()); 
		 System.out.println("Enter email");
		 user.setEmailId(s.next());
		 System.out.println("Enter password");
		user.setPassword(s.next()); 
		 System.out.println("Enter profilePicture");
		 user.setProfilePicture(s.next());
		
		 uService.addUser(user);
		
		
	}

}
