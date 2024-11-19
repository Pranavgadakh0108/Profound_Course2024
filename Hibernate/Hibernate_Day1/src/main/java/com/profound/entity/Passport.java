package com.profound.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Passport_Table")
public class Passport {

	@Id
	private Integer pass_id;
	@Column(name = "Passport_Number", length = 100)
	private String pass_num;
	@Column(name = "Valid_Date")
	private String val_date;

	@OneToOne(mappedBy = "passport")
	Person_Passport person;

	public Passport() {
		super();
	}

	public Passport(Integer pass_id, String pass_num, String val_date) {
		super();
		this.pass_id = pass_id;
		this.pass_num = pass_num;
		this.val_date = val_date;
	}

	public Integer getPass_id() {
		return pass_id;
	}

	public void setPass_id(Integer pass_id) {
		this.pass_id = pass_id;
	}

	public String getPass_num() {
		return pass_num;
	}

	public void setPass_num(String pass_num) {
		this.pass_num = pass_num;
	}

	public String getVal_date() {
		return val_date;
	}

	public void setVal_date(String val_date) {
		this.val_date = val_date;
	}

	public Person_Passport getPerson() {
		return person;
	}

	public void setPerson(Person_Passport person) {
		this.person = person;
	}
	
	
}

	