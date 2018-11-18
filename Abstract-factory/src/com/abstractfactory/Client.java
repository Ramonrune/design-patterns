package com.abstractfactory;

public class Client {

	private static void initializeGUI(WidgetFactory factory){
		initializeGUI(factory.createScrollBar(), factory.createWindow());
	}
	
	private static void initializeGUI(ScrollBar bar, Window window){
		System.out.println("Initialize " + bar.getClass().getName() + " and " + window.getClass().getName());
		
	}
	
	public static void main(String[] args) {
		
		
		WidgetFactory factory = new PinkThemeWidgetFactory();
		initializeGUI(factory);
		
		factory = new YellowThemeWidgetFactory();
		initializeGUI(factory);
		
	}
}
