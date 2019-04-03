package com.linbin.designpattern.proxy;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Client {
	public static void main(String[] args) {
		AbstractObject obj = new ProxyObject();
		obj.operation();
	}
}
