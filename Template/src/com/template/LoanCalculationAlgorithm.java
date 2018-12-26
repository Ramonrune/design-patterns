package com.template;

public abstract class LoanCalculationAlgorithm {
	
	public int calculateLoan(){
		return (int) (getBaseAmount() * getInterest() - calculateDiscount());
	}
	
	abstract int getBaseAmount();
	
	abstract double getInterest();
	
	abstract int calculateDiscount();
}
