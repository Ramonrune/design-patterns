package com.facade;

public class InvoiceCustomerSystem {

	public void createInvoiceForBill(Bill bill){
		System.out.println("Creating an invoice for bill with amount: " + bill.getAmount());
	}
}
