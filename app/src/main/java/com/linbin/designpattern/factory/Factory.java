package com.linbin.designpattern.factory;

/**
 * Created Administrator
 * on 2016/11/10
 * deprecated:
 */

public abstract  class Factory {
    public abstract <T extends Product> T createProduct(Class<T> clz);
}
