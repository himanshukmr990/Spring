package com.springcore.di;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class TestMessage { 

	public static void main(String[] args) { 
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("constructor.xml");		
		Message message = (Message) appContext.getBean("msgBean");
		message.getMsg(); 
		  
		
		   
	}
}
