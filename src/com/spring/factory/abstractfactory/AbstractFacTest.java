package com.spring.factory.abstractfactory;

import com.spring.factory.common.Flower;

public class AbstractFacTest {

    public static void main(String[] args) {
        FlowerFactory flowerFactory = new FlowerFactory();
        Flower flowerMD = flowerFactory.getMuDan();
        Flower flowerMG = flowerFactory.getMeiGui();
        System.out.println(flowerMD);
        System.out.println(flowerMG);
        //扩展时 只需升级内部API，用户只知道多了接口
    }
}
