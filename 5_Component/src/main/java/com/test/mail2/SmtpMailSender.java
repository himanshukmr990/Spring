package com.test.mail2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
//@Qualifier("xyz")
//@Primary
*/


@Component 
@Qualifier("abc")
public class SmtpMailSender implements MailSender{

	public SmtpMailSender() {		 
		System.out.println("SmtpMailSender()");
	}
		 
	public void send(String to, String body) {		 
		System.out.println("SMTP mail sent to "+to+" "+body);
	}
}
