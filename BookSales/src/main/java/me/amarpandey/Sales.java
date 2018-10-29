package me.amarpandey;

import java.time.LocalDate;

public class Sales {

	public enum PaymentMethod {
		CASH, CARD
	}

	private LocalDate date;
	private String email;
	private PaymentMethod paymentMethod;
	private int itemCount;

	public Sales() {

	}

	public Sales(LocalDate date, String email, PaymentMethod paymentMethod, int itemCount) {
		super();
		this.date = date;
		this.email = email;
		this.paymentMethod = paymentMethod;
		this.itemCount = itemCount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public int getItemCount() {
		return itemCount;
	}

	public void setItemCount(int itemCount) {
		this.itemCount = itemCount;
	}

}
