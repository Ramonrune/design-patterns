package com.decorator;

public class IconWindowDecorator extends WindowDecorator {

	public IconWindowDecorator(Window window) {
		super(window);
	}

	
	@Override
	public void draw() {
		System.out.println("Drawing icon");
		window.draw();
	}
}
