package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="student_tbl")

public class Student  extends BaseEntity{
	
	
	private String firstName;
	private String lastName;
	private String  email;
	private String  password;
	private String  std;
	private String  location;
	private LocalDate admissiondate;
	private double scholership;
	
	

	public Student() {
		
	}




	public Student(String firstName, String lastName, String email, String password, String std, String location,
			LocalDate admissiondate, double scholership) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.std = std;
		this.location = location;
		this.admissiondate = admissiondate;
		this.scholership = scholership;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password="
				+ password + ", std=" + std + ", location=" + location + ", admissiondate=" + admissiondate
				+ ", scholership=" + scholership + "]";
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




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getStd() {
		return std;
	}




	public void setStd(String std) {
		this.std = std;
	}




	public String getLocation() {
		return location;
	}




	public void setLocation(String location) {
		this.location = location;
	}




	public LocalDate getAdmissiondate() {
		return admissiondate;
	}




	public void setAdmissiondate(LocalDate admissiondate) {
		this.admissiondate = admissiondate;
	}




	public double getScholership() {
		return scholership;
	}




	public void setScholership(double scholership) {
		this.scholership = scholership;
	}
	
	


	
	

}
