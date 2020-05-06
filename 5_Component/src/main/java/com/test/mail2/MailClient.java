package com.test.mail2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MailClient {

	public static void main(String[] args) {
		
		ApplicationContext factory = new ClassPathXmlApplicationContext("mail.xml");	
		MailService  mailService = (MailService)factory.getBean("mailService");
		mailService.sendMail("Ajit@gl.com", "hello");   
	
	
	
}

}
