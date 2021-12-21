package entities;

import java.util.Date;

public class Client {
	
	private String username;
	private String email;
	private Date birthDate;

	//constructors
	public Client() {
		
	}

	public Client(String username, String email, Date birthDate) {
		this.username = username;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	//getters and setters
	
	
	

}
