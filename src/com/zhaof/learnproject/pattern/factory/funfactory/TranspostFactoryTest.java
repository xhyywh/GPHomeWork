package com.zhaof.learnproject.pattern.factory.funfactory;

import com.zhaof.learnproject.pattern.factory.Transport;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public class TranspostFactoryTest {
    public static void main(String[] args) {
        TranspostFactory transpostFactory = new BikeFactory();
        Transport transport = transpostFactory.getTransport();
        transport.getTransportWay();
    }
}
