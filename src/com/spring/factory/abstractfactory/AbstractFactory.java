package com.spring.factory.abstractfactory;

import com.spring.factory.common.Flower;

public abstract class AbstractFactory {
    //抽象类 可以有自己的业务逻辑和方法
    //可以写一些公用的逻辑
    abstract Flower getMuDan();
}
