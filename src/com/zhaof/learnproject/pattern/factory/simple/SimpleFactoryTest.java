package com.zhaof.learnproject.pattern.factory.simple;

import com.zhaof.learnproject.pattern.factory.Transport;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
            SimpleFactory simpleFactory = new SimpleFactory();
            Transport transport = simpleFactory.getTransport("fuxinghao");
            transport.getTransportWay();
    }
}
