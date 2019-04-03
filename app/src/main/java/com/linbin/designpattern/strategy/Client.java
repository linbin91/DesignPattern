package com.linbin.designpattern.strategy;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Client {


	public static void main(String[] args) {
		double paramA = 5;
		double paramB = 21;
		Calc.calc(new AddStrategy(), 1, 1);
		Calc.calc(new SubStrategy(), paramA, paramB);
		Calc.calc(new MultiStrategy(), paramA, paramB);
		Calc.calc(new DivStrategy(), paramA, paramB);
	}

}
