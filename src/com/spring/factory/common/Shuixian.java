package com.spring.factory.common;

public class Shuixian implements Flower{
    @Override
    public Flower getFlower() {
        return new Shuixian();
    }
}
