package com.test.mail3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MailClient {

	public static void main(String[] args) {
		
//with @Configuration and Component scan(mail.xml)
		
		  ApplicationContext ctx = new ClassPathXmlApplicationContext("mail.xml");
		  MailService  mailService = (MailService)ctx.getBean("mailService");
		  mailService.sendMail("Ajit@gl.com", "hello");		  
		  TestBean testBean = ctx.getBean("testBean",TestBean.class);
		  testBean.test();
		  
//with @Configuration and without Component scan
		/*
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(MailConfig.class);		 
		  MailService  mailService = (MailService)ctx.getBean("mailService"); 
		  mailService.sendMail("Ajit@gl.com", "hello");*/
		 
		 
// with multiple configuration
		
		/*   AnnotationConfigApplicationContext ctx2 =new AnnotationConfigApplicationContext();
		   ctx2.register(MailConfig.class, TestConfig.class);
		   //ctx2.register(AdditionalConfig.class);
		   ctx2.refresh();
		   MailSender  mailService = (MailSender)ctx2.getBean("mockMailSender");
		   mailService.sendMail("Ajit@gl.com", "hello");
		   TestBean testBean = (TestBean)ctx2.getBean("testBean");
		   testBean.test(); */


		
		
//import Bean configuration syntax: 
		  /*
		    @Configuration
		    @Import(TestConfig.class)
		    @ImportResource("mail.xml")
            public class MailConfig {
	       */
		}

}
