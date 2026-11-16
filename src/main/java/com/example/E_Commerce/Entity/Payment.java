package com.example.E_Commerce.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	@OneToOne
	@JoinColumn(name="orderitem_id")
	private OrderItem orderitem;
	
	@Column
	private double Amount;
	
	@Column
	private String PaymentMethod;
	
	@Column
	private Long Transactionid;
	
	@Column
	private LocalDateTime paymentdate=LocalDateTime.now();
	
	public Payment() {}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public OrderItem getOrderitem() {
		return orderitem;
	}

	public void setOrderitem(OrderItem orderitem) {
		this.orderitem = orderitem;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public Long getTransactionid() {
		return Transactionid;
	}

	public void setTransactionid(Long transactionid) {
		Transactionid = transactionid;
	}

	public LocalDateTime getPaymentdate() {
		return paymentdate;
	}

	public void setPaymentdate(LocalDateTime paymentdate) {
		this.paymentdate = paymentdate;
	}
	
	
	

}
