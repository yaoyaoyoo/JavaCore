package com.spring.factory.common;

public class Meigui implements Flower {
    @Override
    public Flower getFlower() {
        return new Meigui();
    }
}
