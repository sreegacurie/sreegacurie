package org.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Profile")
public class UserProfile {
	@OneToOne
	@JoinColumn(name="username")
	private UserCredential credential;
	
	public UserCredential getCredential() {
		return credential;
	}

	public void setCredential(UserCredential credential) {
		this.credential = credential;
	}
@GeneratedValue
	@Column(name="pro_id")
	@Id
	int pro_id;
	@Column(name="first_name")
	String firstname;
	@Column(name="last_name")
	String lastname;
	@Column(name="phone_no")
	String phone_no;
	
	
	public UserProfile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserProfile(int pro_id, String firstname, String lastname, String phone_no) {
		super();
		this.pro_id = pro_id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone_no = phone_no;
	}

	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	

}
