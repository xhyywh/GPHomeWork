package com.zhaof.learnproject.pattern.factory.abs;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public class AbstractTransportFactoryTest {

    public static void main(String[] args) {
        AbstractTransportFactoryImpl transportFactory = new AbstractTransportFactoryImpl();
        transportFactory.getWayByBike();
        transportFactory.getWayByFuxinghao();

    }

}
