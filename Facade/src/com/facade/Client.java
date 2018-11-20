package com.facade;

public class Client {

	public static void main(String[] args) {
		
		BillingSystem billingSystem = new BillingSystem();
		InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();
		
		FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade();
		financialSystemFacade.setBillingSystem(billingSystem);
		financialSystemFacade.setInvoiceCustomerSystem(invoiceCustomerSystem);
		
		financialSystemFacade.createInvoice(1000);
	}
}
