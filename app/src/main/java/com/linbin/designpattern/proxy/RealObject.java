package com.linbin.designpattern.proxy;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class RealObject extends AbstractObject {
	@Override
	public void operation() {
		//一些操作
		System.out.println("一些操作");
	}
}
