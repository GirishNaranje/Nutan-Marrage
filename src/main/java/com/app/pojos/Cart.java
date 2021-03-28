package com.app.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="carts")
public class Cart extends BaseEntity {
	@Column(name="quntity")
	private int quntity;
	@Column(name="totalPrice")
	private double netPrice;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name="userId")
	private User userId;
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER,orphanRemoval=true)
	@JoinColumn(name="cartId")
	private List<Product >productId;
	
	public Cart() {
		System.out.println("in ctor of "+getClass().getName());
	}

    public Cart(int quntity, double netPrice) {
		super();
		this.quntity = quntity;
		this.netPrice = netPrice;
	}
    
	public int getQuntity() {
		return quntity;
	}
    public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
    public double getNetPrice() {
		return netPrice;
	}
    public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public User getUserId() {
		return userId;
	}
    public void setUserId(User userId) {
		this.userId = userId;
	}
   
    public List<Product> getProductId() {
		return productId;
	}

	public void setProductId(List<Product> productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "Cart [quntity=" + quntity + ", netPrice=" + netPrice + ", getId()=" + getId() + "]";
	}
	
	
	
}
