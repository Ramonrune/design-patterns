package com.factorymethod;

public class Client {

	public static void main(String[] args) {
		TransportFactory factory = new BikeFactory();
		
		Transport vehicle = factory.create();
		System.out.println(vehicle.drive());
		
		
		factory = new CarFactory();
		
		vehicle = factory.create();
		System.out.println(vehicle.drive());
	}
}
