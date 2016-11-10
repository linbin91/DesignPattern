package com.linbin.designpattern.abstractfactory;

/**
 * Created Administrator
 * on 2016/11/11
 * deprecated:
 */

public class ConcreteFactory1 extends AbstractFactoty {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}
