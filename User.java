package com.vijay.user.UserEntity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class User {

	@Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE)
	int Id;
	String firstname;
	String middlename;
	String lastname;
//	@DateTimeFormat(pattern="dd/MM/yyyy")
//	Date BirthDay;
	String mobno;
	String email;
//	public User(int id, String firstname, String middlename, String lastname, String mobno,
//			String email) {
//		super();
//		id = id;
//		firstname = firstname;
//		middlename = middlename;
//		lastname = lastname;
////		this.birthDay = birthDay;
//		mobno = mobno;
//		email = email;
//	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
//	public Date getBirthDay() {
//		return birthDay;
//	}
//	public void setBirthDay(Date birthDay) {
//		this.birthDay = birthDay;
//	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User() {}
	
}
