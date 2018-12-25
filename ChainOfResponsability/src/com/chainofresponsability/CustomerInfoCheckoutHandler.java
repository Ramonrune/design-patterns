package com.chainofresponsability;

public class CustomerInfoCheckoutHandler extends CheckoutHandler{

	@Override
	public void handleCheckout() {
		System.out.println("Handling customer info");
		
		if(nextHandler != null){
			nextHandler.handleCheckout();
		}
	}

}
