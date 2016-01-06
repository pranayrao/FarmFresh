package com.farmfresh.business;

public class PaymentBO {
	
	public String paymentID;
	public String paymentAmount;
	public String paymentMode;
	public String paymentInvoiceId;
	public String paymentTransDate;
	
	public String getPaymentID() {
		return paymentID;
	}
	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}
	public String getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getPaymentInvoiceId() {
		return paymentInvoiceId;
	}
	public void setPaymentInvoiceId(String paymentInvoiceId) {
		this.paymentInvoiceId = paymentInvoiceId;
	}
	public String getPaymentTransDate() {
		return paymentTransDate;
	}
	public void setPaymentTransDate(String paymentTransDate) {
		this.paymentTransDate = paymentTransDate;
	}

}
