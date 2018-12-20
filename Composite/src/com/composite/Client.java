package com.composite;

public class Client {

	public static void main(String[] args) {
		
		Line line1 = new Line();
		Rectangle rectangle1 = new Rectangle();
		
		GraphicItemGroup group1 = new GraphicItemGroup();
		
		group1.getGraphics().add(line1);
		group1.getGraphics().add(rectangle1);
		//group1.draw();
		
		
		
		GraphicItemGroup group2 = new GraphicItemGroup();
		group2.getGraphics().add(group1);
		
		Line line2 = new Line();
		group2.getGraphics().add(line2);
		group2.draw();
		
	}
}
