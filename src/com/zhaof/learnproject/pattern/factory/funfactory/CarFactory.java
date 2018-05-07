package com.zhaof.learnproject.pattern.factory.funfactory;

import com.zhaof.learnproject.pattern.factory.Car;
import com.zhaof.learnproject.pattern.factory.Transport;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public class CarFactory implements TranspostFactory {
    @Override
    public Transport getTransport() {
        return new Car();
    }
}
