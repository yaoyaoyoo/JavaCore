package com.spring.factory.abstractfactory;

import com.spring.factory.common.Flower;
import com.spring.factory.common.Mudan;

public class MuDanFac extends AbstractFactory {
    @Override
    Flower getMuDan() {
        return new Mudan();
    }
}
