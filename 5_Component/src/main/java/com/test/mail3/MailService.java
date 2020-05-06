package com.test.mail3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
 

public class MailService {

	MailService(){
		System.out.println("MailService()");
	}
	 
	 
	@Autowired
	@Qualifier("xyz")
	MailSender  mailSender;
	
 
	public MailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String to ,String body)
	{
		mailSender.sendMail(to, body);
	} 
	
	
}
