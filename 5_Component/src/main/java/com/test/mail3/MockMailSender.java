package com.test.mail3;

 
public class MockMailSender implements MailSender{

	public MockMailSender() {		 
		System.out.println("MockMailService()");
	}
	
	 
	public void sendMail(String to, String body) {
		System.out.println("Test mail sent to "+to+" "+body);
		
	}

}
