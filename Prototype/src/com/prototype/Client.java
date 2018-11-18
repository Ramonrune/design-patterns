package com.prototype;

public class Client {

	public static void main(String[] args) {
		
		Image image = new Image();
		image.setUrl("www.image.com/img1.jpg");
		
		
		GraphicTool graphicTool = new GraphicTool(image);
		
		Graphic createGraphic = graphicTool.createGraphic();
		
		System.out.println(createGraphic.getClass() + " ---- " + ((Image)createGraphic).getUrl());
		
		Video video = new Video();
		video.setUrl("www.video.com/video.mp4");
		
		graphicTool = new GraphicTool(video);
		
		createGraphic = graphicTool.createGraphic();
		
		System.out.println(createGraphic.getClass() + " ---- " + ((Video)createGraphic).getUrl());

	}
}
