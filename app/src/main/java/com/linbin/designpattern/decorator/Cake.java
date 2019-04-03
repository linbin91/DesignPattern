package com.linbin.designpattern.decorator;

/**
 * Created by yl1445 on 2019/3/26.
 * 定义被装饰者蛋糕类
 */

public class Cake extends Sweet {
	@Override
	public String getDescription() {
		return "一个蛋糕";
	}

	@Override
	public double cost() {
		return 66;
	}
}
