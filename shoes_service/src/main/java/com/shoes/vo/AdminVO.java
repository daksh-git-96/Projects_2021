package com.shoes.vo;

import java.util.Arrays;

public class AdminVO {

	private int id;
	private String userid;
	private String email;
	private String password;
	private byte[] photo;

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

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "AdminVO [id=" + id + ", userid=" + userid + ", email=" + email + ", password=" + password + ", photo="
				+ Arrays.toString(photo) + "]";
	}

	

}
