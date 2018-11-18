package com.abstractfactory;

public class YellowThemeWidgetFactory implements WidgetFactory {

	@Override
	public ScrollBar createScrollBar() {
		return new YellowThemeScrollBar();
	}

	@Override
	public Window createWindow() {
		return new YellowThemeWindow();
	}

}
