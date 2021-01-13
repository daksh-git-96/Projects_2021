package com.shoes.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart_items_tbl")
public class CartItems {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private RunningShoes runningShoes;

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RunningShoes getRunningShoes() {
		return runningShoes;
	}

	public void setRunningShoes(RunningShoes runningShoes) {
		this.runningShoes = runningShoes;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CartItems [id=" + id + ", runningShoes=" + runningShoes + ", customer=" + customer + ", quantity="
				+ quantity + "]";
	}

}
