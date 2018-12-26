package com.template;

public class CheapLoanCalculation extends LoanCalculationAlgorithm{

	@Override
	int getBaseAmount() {
		return 100;
	}

	@Override
	double getInterest() {
		return 10;
	}

	@Override
	int calculateDiscount() {
		return 20;
	}

}
