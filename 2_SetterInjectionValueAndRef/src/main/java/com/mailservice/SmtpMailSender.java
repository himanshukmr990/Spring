package com.mailservice;

public class SmtpMailSender{
	
	public SmtpMailSender(){
		System.out.println("SmtpMailSender()");
	}
	public void sendMail(String to, String body) {		 
		System.out.println("SMTP mail sent to "+to+" "+body);
	}
}
