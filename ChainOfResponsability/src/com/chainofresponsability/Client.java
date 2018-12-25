package com.chainofresponsability;

public class Client {

	public static void main(String[] args) {
		
		PaymentCheckoutHandler paymentCheckoutHandler = new PaymentCheckoutHandler();
		
		CustomerInfoCheckoutHandler customerInfoCheckoutHandler = new CustomerInfoCheckoutHandler();
		
		paymentCheckoutHandler.setNextHandler(customerInfoCheckoutHandler);
		
		paymentCheckoutHandler.handleCheckout();
	}
}
