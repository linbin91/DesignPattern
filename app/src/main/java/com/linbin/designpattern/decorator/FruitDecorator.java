package com.linbin.designpattern.decorator;

/**
 * Created by yl1445 on 2019/3/26.
 * 定义具体装饰者水果类
 */

public class FruitDecorator extends Decorator {
	Sweet sweet;

	public FruitDecorator(Sweet sweet) {
		this.sweet = sweet;
	}

	@Override
	public String getDescription() {
		return sweet.getDescription() + "，水果";
	}

	@Override
	public double cost() {
		return sweet.cost() + 10;
	}
}
