package training.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User2 {

	@Value("${user2}")
	private String username;	
	@Value("${pass2}")
	private String password;
	@Value("${dept2}")
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
		return "User2 [username=" + username + ", password=" + password
				+ ", dept=" + dept + "]";
	}
	
}
