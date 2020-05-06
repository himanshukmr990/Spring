package com.test.mail2;
 
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*
//@Qualifier("xyz") - configuring xyz as a qualifier for MockMailSender bean
//@Primary
*/


@Component 
//@Primary
@Qualifier("xyz")
public class MockMailSender implements MailSender{

	public MockMailSender() {		 
		System.out.println("MockMailService()");
	}

	 
	public void send(String to, String body) {
		System.out.println("Mock mail sent to "+to+" "+body);
		
	}
 
}
