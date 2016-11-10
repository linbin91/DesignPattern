package com.linbin.designpattern.abstractfactory;

/**
 * Created Administrator
 * on 2016/11/11
 * deprecated:
 */

public class ConcreteFactory2 extends AbstractFactoty {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
