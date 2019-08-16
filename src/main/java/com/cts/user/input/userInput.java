package com.cts.user.input;

import java.util.Scanner;

import com.cts.user.pojo.User;

public class userInput {
	Scanner s=new Scanner(System.in);
	User user=new User();	
	
	public void input() {
		System.out.println("Enter firstName");
		 user.setFirstName(s.next());
		 System.out.println("Enter lastName");
		user.setLastName(s.next()); 
		 System.out.println("Enter email");
		 user.setEmail(s.next());
		 System.out.println("Enter password");
		user.setPassword(s.next()); 
		 System.out.println("Enter profilePicture");
		 user.setProfilePicture(s.next());
		
		
	}

}
