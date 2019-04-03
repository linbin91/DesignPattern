package com.linbin.designpattern.strategy;

/**
 * Created by yl1445 on 2019/3/26.
 * 除法的具体实现策略
 */

public class DivStrategy implements Strategy {
	@Override
	public double calc(double paramA, double paramB) {
		// TODO Auto-generated method stub
		System.out.println("执行除法策略...");
		if (paramB == 0) {
			throw new IllegalArgumentException("除数不能为0!");
		}
		return paramA / paramB;
	}
}
