package com.zhaof.learnproject.pattern.factory.abs;

import com.zhaof.learnproject.pattern.factory.Transport;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public abstract class AbstractTransportFactory {

    public abstract void getWay(Transport t);

    public abstract void getWayByBike();

    public abstract void getWayByBus();

    public abstract void getWayByCar();

    public abstract void getWayByFuxinghao();

}
