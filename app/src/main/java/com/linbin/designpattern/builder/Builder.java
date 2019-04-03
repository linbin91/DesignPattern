package com.linbin.designpattern.builder;

/**
 * Created by yl1445 on 2019/3/25.
 */

public abstract class Builder {
	protected Product mProduct = new Product();

	public Product getResult(){
		return mProduct;
	}

	public abstract void buildBackground();
	public abstract void buildIcon();
	public abstract void buildSounds();

	public Product createProduct() {
		return mProduct;
	}
}
