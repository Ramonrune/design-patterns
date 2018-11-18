package com.prototype;

public class Video extends Graphic{

	private String url;
	

	@Override
	public Graphic clone() {
		
		Video clone = new Video();
		clone.setUrl(url);
		
		return clone;
	}
	
	

	public void setUrl(String url) {
		this.url = url;
	}


	@Override
	public String getUrl() {
		return url;
	}
	
}
