package com.linbin.designpattern.builder;

/**
 * Created by yl1445 on 2019/3/25.
 */

public class Product {
	private String mBackground;
	private String mIcon;
	private String mSounds;

	public String getBackground() {
		return mBackground;
	}
	public void setBackground(String background) {
		mBackground = background;
	}
	public String getIcon() {
		return mIcon;
	}
	public void setIcon(String icon) {
		mIcon = icon;
	}
	public String getSounds() {
		return mSounds;
	}
	public void setSounds(String sounds) {
		mSounds = sounds;
	}
}
