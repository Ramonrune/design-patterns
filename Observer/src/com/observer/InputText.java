package com.observer;

public class InputText implements Observer{

	public void setText(String text){
		
		System.out.println("Input text have this text: " + text);
	}

	@Override
	public void update() {
		setText("Button has been clicked");
	}
}
