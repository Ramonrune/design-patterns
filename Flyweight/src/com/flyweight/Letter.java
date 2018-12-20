package com.flyweight;

public class Letter {

	private String value;
	
	public Letter(String value) {
		System.out.println("New letter created: " + value);
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
}
