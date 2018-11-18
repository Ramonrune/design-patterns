package com.singleton;

public class Preferences {

	private static Preferences instance = null;
	
	private Preferences(){
		
	}
	
	private synchronized static void createInstance(){
		if(instance == null) {
			instance = new Preferences();
		}
	}
	
	public static Preferences getInstance(){
		if(instance == null){
			createInstance();
		}
		
		return instance;
	}
	
	
	public void helloSingleton(){
		System.out.println("Hi, i'am singleton!");
	}
	
	
	
}
