package com.linbin.designpattern.bridge;

/**
 * Created by yl1445 on 2019/3/25.
 */

public class Benz extends Car {
	public Benz(Engine engine) {
		super(engine);
	}

	@Override
	public void install() {
		System.out.println("Benz车安装");
		this.getEngine().addEngine();
	}
}
