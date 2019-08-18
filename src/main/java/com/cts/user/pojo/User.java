package com.cts.user.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
 
	public User() {
		super();
		
	}
	
	private String firstName;
	private String lastName;
	private String userName;
	
	@Id
	private String emailId;
	private String password;
	private String profilePicture;
	
	public User(String firstName, String lastName, String userName, String emailId, String password,
			String profilePicture) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.emailId = emailId;
		this.password = password;
		this.profilePicture = profilePicture;
	}
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", emailId="
				+ emailId + ", password=" + password + ", profilePicture=" + profilePicture + "]";
	}
	
	
	
}
