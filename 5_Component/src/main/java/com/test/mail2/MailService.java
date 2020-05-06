package com.test.mail2;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MailService {

	MailService(){
		System.out.println("MailService()");
	}
	
	/* if more than 1 bean become eligible 
	          
	          1. use @Qualifier 
	               default Qualifier is bean class name in camel case
	               if @Qualifier("abc") or name(@Component("beanName")) is not defined 
	          2. use @Primary
	          
	*/
	 
	@Autowired     										   //@Qualifier("mockMailSender")	// Using the Qualifier configured in bean
	@Qualifier("abc")
	MailSender  mailSender;
	
	public MailSender getMailSender() {
		return mailSender;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	public void sendMail(String to ,String body)
	{
		mailSender.send(to, body);
	}
		
}
