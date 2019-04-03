package com.linbin.designpattern.bridge;

/**
 * Created by yl1445 on 2019/3/25.
 */

public abstract class Car {
	// 持有一个实现部分对象，形成聚合关系
	private Engine engine;


	public Car(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public abstract void install();
}
