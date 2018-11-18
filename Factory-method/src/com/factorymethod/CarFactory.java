package com.factorymethod;

public class CarFactory extends TransportFactory{

	@Override
	Transport create() {
		return new Car();
	}

}
