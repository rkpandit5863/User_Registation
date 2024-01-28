package com.pandit.binding;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class UserRegistation {
	
	@Column(name="ID")
	private Long id;
	@Column(name="FNAME")
	private String firstName;
	@Column (name="LNAME")
	private String lastName;
	@Column (name="DOB")
	private Date dob;
	@Column (name="TENTHPASSYEAR")
	private int tenthPassYear;
	@Column(name="TENTHROLLNUMBER")
	private String tenthRollNumber;
	@Column(name="MOBILENUMBER")
	private String mobileNumber;
	@Column(name="EMAIL")
	private String email;
	@Column(name="STATE")
	private String state;
	@Column(name="AADHARNUMBER")
	private String aadharNumber;
	@Column(name="CATEGORY")
	private String category;
	@Column(name="PASSWORD")
	private String password;
	@Column(name="PHOTOURL")
	private String photoUrl;
}
