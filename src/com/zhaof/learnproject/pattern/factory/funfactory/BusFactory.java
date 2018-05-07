package com.zhaof.learnproject.pattern.factory.funfactory;

import com.zhaof.learnproject.pattern.factory.Bus;
import com.zhaof.learnproject.pattern.factory.Transport;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public class BusFactory implements TranspostFactory {
    @Override
    public Transport getTransport() {
        return new Bus();
    }
}
