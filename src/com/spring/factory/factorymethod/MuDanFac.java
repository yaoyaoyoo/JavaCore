package com.spring.factory.factorymethod;

import com.spring.factory.common.Flower;
import com.spring.factory.common.Mudan;

public class MuDanFac implements FactoryMethod {
    @Override
    public Flower getFlower() {
        return new Mudan();
    }
}
