package com.spring.jdbc;

import java.sql.ResultSet;

import javax.sql.DataSource;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Client {
	public static void main(String[] args) throws Exception{ 
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("SpringBeans.xml"); 		
		AccountDAO  dao = (AccountDAO)ctx.getBean("accountDAO");   
		
		 System.out.println("ACCOUNTS AVAILABLE");
			ResultSet rs = dao.getAccounts();
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " , "+ rs.getString(2)); 
			}
			
			System.out.println("YOUR DETAILS ARE...");
			Account account = dao.getAccount(100);
			 
				System.out.println(account);
		
		 
		
	}
}
