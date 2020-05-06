package com.test.mail1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MailClient {

	public static void main(String[] args) {

		ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("mail.xml");
		MockMailSender  mockMailSender = applicationContext.getBean("mockMailSender", MockMailSender.class);	
		mockMailSender.send("ajit@gl.com", "test", "test body!!!");
		
		SmtpMailSender smtpMailSender  = applicationContext.getBean("smtpMailSender",SmtpMailSender.class);
		smtpMailSender.send("sd@gl.com", "Hello", "kajshfksjdhfk");
		
		
		
	}

}
