package com.mailservice;

public class MailSender {

	public MailSender() {
		System.out.println("MailSender()");
	}

	private SmtpMailSender smtpMailSender;

	public void sendMail(String to, String body) {

		smtpMailSender.sendMail(to, body);
	}

	public SmtpMailSender getSmtpMailSender() {
		return smtpMailSender;
	}

	public void setSmtpMailSender(SmtpMailSender smtpMailSender) {
		System.out.println("setSmtpMailSender()");
		this.smtpMailSender = smtpMailSender;
	}

}
