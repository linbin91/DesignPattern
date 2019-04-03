package com.linbin.designpattern.decorator;

/**
 * Created by yl1445 on 2019/3/26.
 * 定义组件类，也是装饰者和被装饰者的超类
 */

public abstract class Sweet {
	String description = "Sweet";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
