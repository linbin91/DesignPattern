package com.linbin.designpattern.singleton;

/**
 * Created by yl1445 on 2019/3/20.
 */

public class SingletonPattern {
	private static final SingletonPattern instance = new SingletonPattern();
	private static SingletonPattern instance1 = null;
	//限制了外部new
	private SingletonPattern() {

	}

	public static SingletonPattern getInstance() {
		return instance;
	}

	public static SingletonPattern getInstance1() {
		if (instance1 == null) {
			synchronized (SingletonPattern.class) {
				if (instance1 == null) {
					instance1 = new SingletonPattern();
				}
			}
		}
		return instance1;
	}
}
