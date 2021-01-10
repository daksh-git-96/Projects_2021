package com.shoes.vo;

import java.sql.Timestamp;
import java.util.Arrays;

public class CustomerVO {
	
	private int id;
	private String userid;
	private String email;
	private String password;
	private String mobile;
	private String gender;
	private String profilePhoto;
	private String role;
	private Timestamp doe;
	
	public Timestamp getDoe() {
		return doe;
	}

	public void setDoe(Timestamp doe) {
		this.doe = doe;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
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
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getProfilePhoto() {
		return profilePhoto;
	}
	
	public void setProfilePhoto(String profilePhoto) {
		this.profilePhoto = profilePhoto;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", userid=" + userid + ", email=" + email + ", password=" + password
				+ ", mobile=" + mobile + ", gender=" + gender + ", profilePhoto=" + profilePhoto + ", role=" + role
				+ ", doe=" + doe + "]";
	}

	
	
	
	
}
