package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
@Table(name="products")
public class Product extends BaseEntity {
   @Column(name="product_name")
   private String name;
   @Column(name="unit_price")
   private double price;
   @Column(name="expiryDate")
   @NotNull(message = "reg date is required")
   @DateTimeFormat(pattern = "yyyy-MM-dd")
   private LocalDate xDate;
   @Column(name="quntity")
   private int quntity;
   @ManyToOne()
   @JoinColumn(name="cartId")
   private Cart cartId;
   
   
public Product() {
	System.out.println("in ctor of "+getClass().getName());
}

public Product( String name, double price, LocalDate xDate,int quntity) {
	super();

	this.name = name;
	this.price = price;
	this.xDate = xDate;
	this.quntity=quntity;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}


public LocalDate getxDate() {
	return xDate;
}

public void setxDate(LocalDate xDate) {
	this.xDate = xDate;
}


public Cart getCartId() {
	return cartId;
}

public void setCartId(Cart cartId) {
	this.cartId = cartId;
}


public int getQuntity() {
	return quntity;
}

public void setQuntity(int quntity) {
	this.quntity = quntity;
}

@Override
public String toString() {
	return "Product [name=" + name + ", price=" + price + ", xDate=" + xDate + ", getId()=" + getId() + "]";
}

}
