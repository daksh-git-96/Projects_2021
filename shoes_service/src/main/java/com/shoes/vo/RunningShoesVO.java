package com.shoes.vo;

import java.util.Arrays;

public class RunningShoesVO {
	
	private int id;
	private String brand;
	private String name;
	private String color;
	private float price;
	private float size;
	private String gender;
	private byte[] photo;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getSize() {
		return size;
	}
	
	public void setSize(float size) {
		this.size = size;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "RunningShoesVO [id=" + id + ", brand=" + brand + ", name=" + name + ", color=" + color + ", price="
				+ price + ", size=" + size + ", gender=" + gender + ", photo=" + Arrays.toString(photo) + "]";
	}



}
