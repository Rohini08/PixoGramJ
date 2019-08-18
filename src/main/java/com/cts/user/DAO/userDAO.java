package com.cts.user.DAO;

import java.util.Scanner;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cts.user.pojo.User;

import com.cts.user.pojo.User;

@Repository
public class userDAO {
	
	//@Autowired
	userDAO userdao;
	
	Scanner s=new Scanner(System.in);
	User user=new User();  
	
	   EntityManager  em = com.cts.user.utilities.JPAHibernateUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn= em.getTransaction();
		
		public  void addUser(User user)
		{
			 txn.begin();
			 em.persist(user);
			
			txn.commit();

			com.cts.user.utilities.JPAHibernateUtil.shutdown();
			s.close();
		}
		
		 

}
