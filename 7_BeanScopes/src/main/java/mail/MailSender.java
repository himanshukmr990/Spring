package mail;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

public class MailSender 																	
	{
	
	MailSender(){
		System.out.println("MailSender()");
	}
		
    SmtpMailSender  smtpMailSender;

	public SmtpMailSender getSmtpMailSender() {			
		return this.smtpMailSender;  
	}

	public void setSmtpMailSender(SmtpMailSender smtpMailSender) { 
		this.smtpMailSender=smtpMailSender;
	}
    
	public void sendMail(String to ,String body)
	{
		System.out.println("From: sendMail "+smtpMailSender);
		smtpMailSender.send(to, body);
	}
	 
		
	}
