package org.firstclass;

//import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="EMPLOYEE_DETAILS")
public class Class1 {
	//Scanner obj = new Scanner(System.in);

	public Class1() {

	}

	public Class1(int id,String name,String email,long phone) { 
		//super();
		this.id=id;
	this.name=name; this.email=email; this.phone=phone; }


	public int getId() {
		//System.out.print("Enter Id:");
		//id = obj.nextInt();
		return id;
	}

	public void setId(int id) {
		this.id = id;
		//System.out.println("Id:" + id);
	}

	public String getName() {
		//System.out.print("Enter Name:");
		//name = obj.next();
		return name;
	}

	public void setName(String name) {
		this.name = name;
		//System.out.println("Name:" + name);
	}

	public String getEmail() {
		//System.out.print("Enter Email:");
		//email = obj.next();
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
		//System.out.println("Email:" + email);
	}

	public long getPhone() {
		//System.out.print("Enter Phone no:");
		//phone = obj.nextLong();
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
		//System.out.println("Phone:" + phone);

	}

	@Id
	@GeneratedValue
	@Column (name="EMP_ID")
	private int id;
	@Column (name="EMP_NAME",length=25,nullable=false)
	
	private String name;
	@Column (name="EMAIL_ID")
	String email;
	@Column (name="EMP_PHONE")
	private long phone;
	@Column (name="BA")
	double basicSalary;
	@Column (name="DA")
	float dearnessAllowance;
	@Column (name="HRA")
	float houseRentAllowance;
	@Column (name="PF")
	float profidentFund;
	@Column (name="TA")
	float tranFund;
	@Column (name="NET_SALARY")
	@Transient
	float netSalary;
	// private boolean gender;

}
