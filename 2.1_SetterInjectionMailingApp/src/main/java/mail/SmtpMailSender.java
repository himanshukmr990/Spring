package mail;

public class SmtpMailSender implements MailSender{

	public SmtpMailSender() {		 
		System.out.println("SmtpMailSender()");
	}
	
	@Override
	public void send(String to, String body) {
		 
		System.out.println("SMTP mail sent to "+to+" "+body);
	}
}
