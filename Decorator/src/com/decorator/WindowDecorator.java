package com.decorator;

public class WindowDecorator extends Window {

	protected Window window;

	public WindowDecorator(Window window) {
		super();
		this.window = window;
	}

	
	@Override
	public void draw() {
		window.draw();
	}
	
}
