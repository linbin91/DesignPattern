package com.linbin.designpattern.builder;

/**
 * Created by yl1445 on 2019/3/25.
 */

public class ConcreteBuilder extends Builder {
	@Override
	public void buildBackground(){
		mProduct.setBackground("Black");
	}
	@Override
	public void buildIcon(){
		mProduct.setIcon("MyIcon");
	}
	@Override
	public void buildSounds(){
		mProduct.setSounds("MySounds");
	}
}
