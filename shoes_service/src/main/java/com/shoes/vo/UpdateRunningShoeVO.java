package com.shoes.vo;

public class UpdateRunningShoeVO {

	private int id;
	private String color;
	private float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "UpdateRunningShoe [id=" + id + ", color=" + color + ", price=" + price + "]";
	}

}
