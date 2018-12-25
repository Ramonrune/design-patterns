package com.chainofresponsability;

public class PaymentCheckoutHandler extends CheckoutHandler {

	@Override
	public void handleCheckout() {
		System.out.println("Handling payment");
		
		if(nextHandler != null){
			nextHandler.handleCheckout();
		}
		
	}

}
