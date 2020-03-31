package com.spring.factory.abstractfactory;

import com.spring.factory.common.Flower;
import com.spring.factory.common.Meigui;
import com.spring.factory.common.Mudan;

public class FlowerFactory extends AbstractFactory {
    @Override
    Flower getMuDan() {
        return new Mudan();
    }

    @Override
    Flower getMeiGui() {
        return new Meigui();
    }
}
