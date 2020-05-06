package com.spring.jdbc;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.Account;
import com.spring.jdbc.AccountDAO; 
import com.spring.jdbc.AccountDAO;

public class Client {

	public static void main(String[] args) { 
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        AccountDAO accountDao = context.getBean("accountDAO", AccountDAO.class);
         
        Account  ac = accountDao.getAccountDetails(100);
       	System.out.println("Number of Accounts:" +ac.getName());
		

        
	}

	}


