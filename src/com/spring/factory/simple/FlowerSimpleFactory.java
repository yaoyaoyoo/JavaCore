package com.spring.factory.simple;

import com.spring.factory.common.Flower;
import com.spring.factory.common.Meigui;
import com.spring.factory.common.Mudan;
import com.spring.factory.common.Shuixian;

public class FlowerSimpleFactory {
    public Flower getFlower(String type) {
        if ("mudan".equals(type)) {
            return new Mudan();
        }
        if ("meigui".equals(type)) {
            return new Meigui();
        }
//        if ("shuixian".equals(type)) {
//            return new Shuixian();
//        }
        return null;
    }
}
