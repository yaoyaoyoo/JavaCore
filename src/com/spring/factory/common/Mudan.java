package com.spring.factory.common;

public class Mudan implements Flower{
    @Override
    public Flower getFlower() {
        return new Mudan();
    }
}
