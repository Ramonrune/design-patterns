package com.template;

public class ExpensiveLoanCalculation extends LoanCalculationAlgorithm{

	@Override
	int getBaseAmount() {
		return 100000;
	}

	@Override
	double getInterest() {
		return 5.4;
	}

	@Override
	int calculateDiscount() {
		return 100;
	}

}
