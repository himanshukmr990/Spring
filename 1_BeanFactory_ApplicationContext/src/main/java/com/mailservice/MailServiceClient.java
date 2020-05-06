package com.mailservice;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
 
 
public class MailServiceClient {
	public static void main(String[] args) {
		
/***** using BeanFactory *******/	
	
		/* Resource res_classpath  = new ClassPathResource("mailservice.xml");
		 Resource res_filesystem = new FileSystemResource("D:\\SpringGL\\1_BeanFactory_ApplicationContext\\beansXmls\\mailservice2.xml");
        
		  BeanFactory  beanFactory_classpath = new XmlBeanFactory(res_classpath);
         //BeanFactory  beanFactory_FileResource =new XmlBeanFactory(res_filesystem);
		  
         MailSender  sender = beanFactory_classpath.getBean("mailSender",MailSender.class); 
         //MailSender  sender = beanFactory_FileResource.getBean("mailSender",MailSender.class);
         sender.sendMail("XYZ@GL.com", "Hello!");*/
     
		 
 /**** USING ApplicationContaxt ***/	
	    
			
          //ClassPathXmlApplicationContext 
				ApplicationContext appContext_ClassPath = new ClassPathXmlApplicationContext("mailservice.xml");		 
                MailSender mailSender = (MailSender) appContext_ClassPath.getBean("mailSender");
		        mailSender.sendMail("ajit@gl.com", "Welcome !");
    	
		 
        /*
          //FileSystemXmlApplicationContex
		        ApplicationContext appContext_FileSystem =new FileSystemXmlApplicationContext("D:\\SpringGL\\1_BeanFactory_ApplicationContext\\beansXmls\\mailservice2.xml");
		        MailSender  mailSender2 = appContext_FileSystem.getBean("mailSender",MailSender.class);
		        mailSender2.sendMail("Neha@gl.com", "Welcome !");
		*/   
		   
/**** with multiple XML file ***/
		 //ApplicationContext ctx2 = new ClassPathXmlApplicationContext( new String[]{"app1.xml","app2.xml"});
		 //can use <import resource="service-config.xml"/> to import another XML configuration
	}

}
