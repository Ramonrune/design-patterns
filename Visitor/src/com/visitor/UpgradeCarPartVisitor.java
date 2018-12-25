package com.visitor;

public class UpgradeCarPartVisitor implements CarPartVisitor {

	@Override
	public void visit(CarPart carPart) {
		System.out.println("Upgrade " + carPart);
	}

}
