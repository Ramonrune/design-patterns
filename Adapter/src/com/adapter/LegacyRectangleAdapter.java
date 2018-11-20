package com.adapter;

public class LegacyRectangleAdapter extends Rectangle {

	private LegacyRectangle legacyRectangle;

	public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
		super();
		this.legacyRectangle = legacyRectangle;
	}
	
	@Override
	public Integer determineSize(){
		return legacyRectangle.calculateSize();
	}
	
	
}
