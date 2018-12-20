package com.proxy;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		ImageProxy image1 = new ImageProxy("Test1");
		ImageProxy image2 = new ImageProxy("Test2");
		
		List<Image> images = new ArrayList<>();
		images.add(image1);
		images.add(image2);
		
		Application application = new Application(images);
		application.draw();

	}
}
