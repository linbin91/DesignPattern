package com.linbin.designpattern.decorator;

/**
 * Created by yl1445 on 2019/3/26.
 */

public class Client {
	public static void main(String[] args) {

		Cake cake = new Cake();
		System.out.println(cake.getDescription() + "总共花费" + cake.cost());

		FruitDecorator fruitDecorator = new FruitDecorator(cake);
		System.out.println(fruitDecorator.getDescription() + "总共花费" + fruitDecorator.cost());

		CandleDecorator candleDecorator = new CandleDecorator(fruitDecorator);
		System.out.println(candleDecorator.getDescription() + "总共花费" + candleDecorator.cost());

	}
}
