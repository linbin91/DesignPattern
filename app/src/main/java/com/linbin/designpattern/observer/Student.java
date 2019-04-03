package com.linbin.designpattern.observer;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Student implements MyObserver {
	@Override
	public void update(String message) {
		System.out.println(getClass().getSimpleName()+"收到"+message);
	}
}