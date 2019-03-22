package com.linbin.designpattern.adapter;

/**
 * Created by yl1445 on 2019/3/21.
 */

/**
 * adapter角色
 */
public class ClassAdapter extends Volt220 implements FiveVolt{
	@Override
	public int getVolt5() {
		return 5;
	}
}
