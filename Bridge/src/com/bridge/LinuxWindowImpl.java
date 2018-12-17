package com.bridge;

public class LinuxWindowImpl extends WindowImpl {

	@Override
	public void draw(int x, int y, int width, int height, String color) {

		System.out.println("Linux: x:" + x + " y:" + y + " width:" + width + " height:" + height + " color:" + color);
	}
	

}
