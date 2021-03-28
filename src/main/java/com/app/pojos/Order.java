package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="orders")
public class Order extends BaseEntity{

	@Column(name="orderDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate orderDate;
	private int cId;
	@Column(name="cost")
	private double cost;
	
	public Order () {
		System.out.println("in the ctor of "+getClass().getName());
	}

	public Order( LocalDate orderDate, int cId,double cost) {
		super();
		
		this.orderDate = orderDate;
		this.cId = cId;
		this.cost=cost;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}
	

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Order [orderDate=" + orderDate + ", cId=" + cId + ", cost=" + cost + ", getId()=" + getId() + "]";
	}

	
}

