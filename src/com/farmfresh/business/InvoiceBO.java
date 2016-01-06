package com.farmfresh.business;

public class InvoiceBO {
	
	public String invoiceID;
	public String invoiceTax;
	public String invoiceBillAmt;
	public String invoiceTotalAmt;
	public String invoiceShipmentId;
	
	public String getInvoiceID() {
		return invoiceID;
	}
	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}
	public String getInvoiceTax() {
		return invoiceTax;
	}
	public void setInvoiceTax(String invoiceTax) {
		this.invoiceTax = invoiceTax;
	}
	public String getInvoiceBillAmt() {
		return invoiceBillAmt;
	}
	public void setInvoiceBillAmt(String invoiceBillAmt) {
		this.invoiceBillAmt = invoiceBillAmt;
	}
	public String getInvoiceTotalAmt() {
		return invoiceTotalAmt;
	}
	public void setInvoiceTotalAmt(String invoiceTotalAmt) {
		this.invoiceTotalAmt = invoiceTotalAmt;
	}
	public String getInvoiceShipmentId() {
		return invoiceShipmentId;
	}
	public void setInvoiceShipmentId(String invoiceShipmentId) {
		this.invoiceShipmentId = invoiceShipmentId;
	}

}
