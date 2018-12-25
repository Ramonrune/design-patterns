package com.visitor;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private List<CarPart> carParts = new ArrayList<>();
	
	public List<CarPart> getCarParts(){
		return carParts;
	}
	
	public void render(){
		RenderCarPartVisitor renderer = new RenderCarPartVisitor();
		
		for(CarPart carPart : carParts){
			carPart.acceptCarPartVisitor(renderer);
		}
	}
	
	public void print(){
		PrintCarPartVisitor printCarPartVisitor = new PrintCarPartVisitor();
		
		for(CarPart carPart : carParts){
			carPart.acceptCarPartVisitor(printCarPartVisitor);
		}
	}
	
	
	public void upgrade(){
		UpgradeCarPartVisitor upgradeCarPartVisitor = new UpgradeCarPartVisitor();
		
		for(CarPart carPart : carParts){
			carPart.acceptCarPartVisitor(upgradeCarPartVisitor);
		}
	}
}
