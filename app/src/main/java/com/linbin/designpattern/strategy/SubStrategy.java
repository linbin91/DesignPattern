package com.linbin.designpattern.strategy;

/**
 * Created by yl1445 on 2019/3/26.
 * 减法的具体实现策略
 */

public class SubStrategy implements Strategy {
	@Override
	public double calc(double paramA, double paramB) {
		// TODO Auto-generated method stub
		System.out.println("执行减法策略...");
		return paramA - paramB;
	}
}
