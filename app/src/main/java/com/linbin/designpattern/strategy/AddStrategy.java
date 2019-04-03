package com.linbin.designpattern.strategy;

/**
 * Created by yl1445 on 2019/3/26.
 * 加法的具体实现策略
 */

public class AddStrategy implements Strategy{
	@Override
	public double calc(double paramA, double paramB) {
		// TODO Auto-generated method stub
		System.out.println("执行加法策略...");
		return paramA + paramB;
	}
}
