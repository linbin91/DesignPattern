package com.linbin.designpattern.strategy;

/**
 * Created by yl1445 on 2019/3/26.
 * 乘法的具体实现策略
 */

public class MultiStrategy implements Strategy {
	@Override
	public double calc(double paramA, double paramB) {
		// TODO Auto-generated method stub
		System.out.println("执行乘法策略...");
		return paramA * paramB;
	}
}
