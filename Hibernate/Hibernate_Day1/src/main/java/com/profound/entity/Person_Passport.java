package com.profound.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Person_Table")
public class Person_Passport {

	@Id
	@Column(name = "person_Id")
	private Integer pid;
	@Column(name = "First_name")
	private String fname;
	@Column(name = "Last_name")
	private String lname;
	@Column(name = "Date_of_birth")
	private String dob;

	@OneToOne
	@JoinColumn(name = "pass_id")
	Passport passport;

	public Person_Passport() {
		super();
	}

	public Person_Passport(Integer pid, String fname, String lname, String dob, Passport passport) {
		super();
		this.pid = pid;
		this.fname = fname;
		this.lname = lname;
		this.dob = dob;
		this.passport = passport;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

}
