package com.zhaof.learnproject.pattern.factory.simple;

import com.zhaof.learnproject.pattern.factory.*;

/**
 * Created by zhaof on 2018/5/6 0006.
 */
public class SimpleFactory{

    public Transport getTransport(String name)
    {
        switch (name){
            case "car":
                return new Car();
            case "bus":
                return new Bus();
            case "bike":
                return new Bike();
            case "fuxinghao":
                return new Fuxinghao();
            default:
                return  null;
        }
    }
}
