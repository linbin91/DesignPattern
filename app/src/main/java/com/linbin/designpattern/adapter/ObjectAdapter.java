package com.linbin.designpattern.adapter;

/**
 * Created by yl1445 on 2019/3/21.
 */

// 对象适配器模式
public class ObjectAdapter implements FiveVolt {

	Volt220 mVolt220;

	public ObjectAdapter(Volt220 adaptee) {
		mVolt220 = adaptee;
	}

	public int getVolt220() {
		return mVolt220.getVolt220();
	}

	@Override
	public int getVolt5() {
		return 5;
	}

}
