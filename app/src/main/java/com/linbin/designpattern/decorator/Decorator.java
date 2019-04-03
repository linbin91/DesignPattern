package com.linbin.designpattern.decorator;

/**
 * Created by yl1445 on 2019/3/26.
 * 定义抽象装饰者类
 */

public abstract class Decorator extends Sweet {
	@Override
	public abstract String getDescription();
}
