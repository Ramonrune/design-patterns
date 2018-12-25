package com.mediator;

public class Client {

	public static void main(String[] args) {

		
		InputText inputText = new InputText();
		List list = new List();
		
		list.getItems().add("Data item one");
		list.getItems().add("Data item two");
		list.getItems().add("Data item three");

		
		
		ScreenDirectorOne screenDirector = new ScreenDirectorOne();
		screenDirector.setInputText(inputText);
		
		
		list.setScreenDirector(screenDirector);
		
		list.selectItem(0);
		
		
		System.out.println("Selected item was: " + inputText.getValue());
	
	}
}
