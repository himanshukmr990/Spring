package com.mailservice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MailSenderClient {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("mailservice.xml");
		MailSender mailSender = factory.getBean("mailSender",MailSender.class);
		mailSender.sendMail("xyz@gmail.com", "Welcome to Spring !!");
	}

}
