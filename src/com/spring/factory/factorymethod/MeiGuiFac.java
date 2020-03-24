package com.spring.factory.factorymethod;

import com.spring.factory.common.Flower;
import com.spring.factory.common.Meigui;

public class MeiGuiFac implements FactoryMethod {
    @Override
    public Flower getFlower() {
        return new Meigui();
    }
}
