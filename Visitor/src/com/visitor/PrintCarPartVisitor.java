package com.visitor;

public class PrintCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		System.out.println("Print " + carPart);
		
	}

}
