package com.zhaof.learnproject.pattern.factory;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public class Car implements Transport {
    @Override
    public void getTransportWay() {
        System.out.println("您选择的出行交通工具是小汽车");
    }
}

