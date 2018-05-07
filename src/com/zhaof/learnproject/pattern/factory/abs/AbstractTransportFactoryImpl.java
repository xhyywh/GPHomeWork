package com.zhaof.learnproject.pattern.factory.abs;

import com.zhaof.learnproject.pattern.factory.Transport;
import com.zhaof.learnproject.pattern.factory.funfactory.BikeFactory;
import com.zhaof.learnproject.pattern.factory.funfactory.BusFactory;
import com.zhaof.learnproject.pattern.factory.funfactory.CarFactory;
import com.zhaof.learnproject.pattern.factory.funfactory.FuxinghaoFactory;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public  class AbstractTransportFactoryImpl extends AbstractTransportFactory{


    @Override
    public void getWay(Transport t) {
            t.getTransportWay();
    }

    @Override
    public void getWayByBike() {
        getWay(new BikeFactory().getTransport());
    }

    @Override
    public void getWayByBus() {
        getWay(new BusFactory().getTransport());
    }

    @Override
    public void getWayByCar() {
        getWay(new CarFactory().getTransport());
    }

    @Override
    public void getWayByFuxinghao() {
        getWay(new FuxinghaoFactory().getTransport());
    }
}
