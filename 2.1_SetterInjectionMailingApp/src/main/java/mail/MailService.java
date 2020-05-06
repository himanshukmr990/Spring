package mail;

public class MailService {

	MailService(){
		System.out.println("MailService()");
	}
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
