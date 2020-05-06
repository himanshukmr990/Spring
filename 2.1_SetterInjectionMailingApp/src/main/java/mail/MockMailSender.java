package mail;

public class MockMailSender implements MailSender{

	public MockMailSender() {		 
		System.out.println("MockMailService()");
	}
	
	@Override
	public void send(String to, String body) {
		System.out.println("Test mail sent to "+to+" "+body);
		
	}

}
