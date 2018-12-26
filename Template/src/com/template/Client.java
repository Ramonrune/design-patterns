package com.template;

public class Client {

	public static void main(String[] args) {
		
		ExpensiveLoanCalculation expensiveLoanCalculation = new ExpensiveLoanCalculation();
		System.out.println(expensiveLoanCalculation.calculateLoan());
		
		CheapLoanCalculation cheapLoanCalculation = new CheapLoanCalculation();
		System.out.println(cheapLoanCalculation.calculateLoan());
		
	}
}
