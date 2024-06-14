package com.ekotomitl.models;


import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="payment")
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpayment", nullable=false)
    private int idpayment;

    @Column(name = "payment_date", nullable = false)
    private LocalDate payment_date; //Revisar las fechas

    @Column(name = "amount", nullable = false)
    private BigDecimal amount;

    @Column(name = "status", nullable = false, length = 30)
    private String status;
    
    @OneToOne(mappedBy="payment") //Relación con orders
    private Orders orders;

	public Payment() {
		super();
	}

	public Payment(int idpayment, LocalDate payment_date, BigDecimal amount, String status, Orders orders) {
		super();
		this.idpayment = idpayment;
		this.payment_date = payment_date;
		this.amount = amount;
		this.status = status;
		this.orders = orders;
	}

	public int getIdpayment() {
		return idpayment;
	}

	public void setIdpayment(int idpayment) {
		this.idpayment = idpayment;
	}

	public LocalDate getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(LocalDate payment_date) {
		this.payment_date = payment_date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Payment [idpayment=" + idpayment + ", payment_date=" + payment_date + ", amount=" + amount + ", status="
				+ status + ", orders=" + orders + "]";
	}

    

}
