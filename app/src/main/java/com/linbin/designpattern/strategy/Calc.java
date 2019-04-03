package com.linbin.designpattern.strategy;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Calc {
	private Strategy strategy;
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public double calc(double paramA, double paramB) {
		// TODO Auto-generated method stub
		// doing something
		if (this.strategy == null) {
			throw new IllegalStateException("你还没有设置计算的策略");
		}
		return this.strategy.calc(paramA, paramB);
	}

	//执行方法
	public static double calc(Strategy strategy, double paramA, double paramB) {
		Calc calc = new Calc();
		calc.setStrategy(strategy);
		return calc.calc(paramA, paramB);
	}
}
