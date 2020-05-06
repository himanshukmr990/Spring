package training.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User1 {
 
	@Value("${user}")
	private String username; 
	@Value("${pass}")
	private String password; 
	@Value("${dept}")
	private String dept;	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "User1 [username=" + username + ", password=" + password
				+ ", dept=" + dept + "]";
	}
	
}
