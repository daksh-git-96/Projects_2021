package com.shoes.vo;

import java.sql.Timestamp;

public class CartItemsVO {

	private int id;
	private RunningShoesVO runningShoesVO;
	private CustomerVO customerVO;
	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RunningShoesVO getRunningShoesVO() {
		return runningShoesVO;
	}

	public void setRunningShoesVO(RunningShoesVO runningShoesVO) {
		this.runningShoesVO = runningShoesVO;
	}

	public CustomerVO getCustomerVO() {
		return customerVO;
	}

	public void setCustomerVO(CustomerVO customerVO) {
		this.customerVO = customerVO;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItemsVO [id=" + id + ", runningShoesVO=" + runningShoesVO + ", customerVO=" + customerVO
				+ ", quantity=" + quantity + "]";
	}

}
