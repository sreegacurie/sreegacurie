package org.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Credential")
public class UserCredential {
	@OneToOne
	@JoinColumn(name="pro_id")
	private UserProfile profile;
	
	
	
	public UserProfile getProfile() {
		return profile;
	}
	public void setProfile(UserProfile profile) {
		this.profile = profile;
	}
	@GeneratedValue
	@Column(name="user_name")
	@Id
	String username;
	@Column(name="password")
	String password;
	@Column(name="status")
	boolean status;
	
	
	public UserCredential() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserCredential(String username, String password, boolean status) {
		super();
		this.username = username;
		this.password = password;
		this.status = status;
		
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
