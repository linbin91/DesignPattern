package com.linbin.designpattern.bridge;

/**
 * Created by yl1445 on 2019/3/25.
 */

public class Bwm extends Car {
	public Bwm(Engine engine) {
		super(engine);
	}
	@Override
	public void install() {
		System.out.println("Bwm车安装");
		this.getEngine().addEngine();
	}
}
