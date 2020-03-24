package com.spring.factory.factorymethod;

import com.spring.factory.common.Flower;

public class FactoryMethodTest {
    public static void main(String[] args) {

        FactoryMethod muDanFac = new MuDanFac();
        Flower flowerMD = muDanFac.getFlower();

        FactoryMethod meiGuiFac = new MeiGuiFac();
        Flower flowerMG = meiGuiFac.getFlower();
        System.out.println(flowerMD);
        System.out.println(flowerMG);

        //扩展：只需要新增工厂及类型，不需修改原有实现
        //问题：用户又需要去指定工厂类型，又回到不使用工厂时候的情景

    }
}
