package com.observer;

public class List implements Observer{

	
	public void setListValue(int value){
		System.out.println("List value is: " + value);
	}

	@Override
	public void update() {
		setListValue(1);
	}
}
