package com.facade;

public class FinancialSystemFacade {

	private BillingSystem billingSystem;
	private InvoiceCustomerSystem invoiceCustomerSystem;
	
	public void createInvoice(Integer amount){
		Bill bill = billingSystem.createBill(1000);
		invoiceCustomerSystem.createInvoiceForBill(bill);
	}
	
	
	public void setBillingSystem(BillingSystem billingSystem) {
		this.billingSystem = billingSystem;
	}
	public void setInvoiceCustomerSystem(InvoiceCustomerSystem invoiceCustomerSystem) {
		this.invoiceCustomerSystem = invoiceCustomerSystem;
	}
	
	
	
}
