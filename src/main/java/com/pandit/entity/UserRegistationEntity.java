package com.pandit.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="users_details")
public class UserRegistationEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String lastName;
	private Date dob;
	private int tenthPassYear;
	private String tenthRollNumber;
	private String mobileNumber;
	private String email;
	private String state;
	private String aadharNumber;
	private String category;
	private String password;
	private String photoUrl;
		
}
