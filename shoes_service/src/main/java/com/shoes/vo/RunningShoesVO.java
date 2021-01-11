package com.shoes.vo;

public class RunningShoesVO {
	
	private int id;
	private String name;
	private String color;
	private float price;
	private float size;
	private String photo;
	
	private AdminVO adminVO;
	
	public AdminVO getAdminVO() {
		return adminVO;
	}

	public void setAdminVO(AdminVO adminVO) {
		this.adminVO = adminVO;
	}

	public String getPhoto() {
		return photo;
	}
	
	public void setPhoto(String photo) {
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
	
	@Override
	public String toString() {
		return "RunningShoesVO [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", size="
				+ size + ", photo=" + photo + "]";
	}
	
}
