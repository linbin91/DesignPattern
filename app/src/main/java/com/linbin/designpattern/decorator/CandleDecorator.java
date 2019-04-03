package com.linbin.designpattern.decorator;

/**
 * Created by yl1445 on 2019/3/26.
 * 定义具体装饰者蜡烛类
 */

public class CandleDecorator extends Decorator {
	Sweet sweet;

	public CandleDecorator(Sweet sweet) {
		this.sweet = sweet;
	}

	@Override
	public String getDescription() {
		return sweet.getDescription() + "，蜡烛";
	}

	@Override
	public double cost() {
		return sweet.cost() + 10;
	}
}
