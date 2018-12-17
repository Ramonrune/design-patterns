package com.bridge;

public class DirectXWindowImpl extends WindowImpl {

	@Override
	public void draw(int x, int y, int width, int height, String color) {

		System.out.println("Direct X: x:" + x + " y:" + y + " width:" + width + " height:" + height + " color:" + color);
	}
	

}
