package com.spring.factory.simple;

import com.spring.factory.common.Flower;
import com.spring.factory.common.Meigui;
import com.spring.factory.common.Mudan;

public class SimpleTest {
    public static void main(String[] args) {
        //normal
        //get instance
        Meigui meigui = new Meigui();
        Mudan mudan = new Mudan();
        System.out.println(meigui);
        System.out.println(mudan);

        //factory  无需用户手动new，只需告知需要什么类型的对象
        //扩展factory： 新增if else  要修改工厂
        FlowerSimpleFactory factory = new FlowerSimpleFactory();
        Flower flowerMG = factory.getFlower("meigui");
        Flower flowerMD = factory.getFlower("mudan");
//        Flower flowerSX = factory.getFlower("shuixian");
        System.out.println(flowerMG);
        System.out.println(flowerMD);
//        System.out.println(flowerSX);
    }
}
