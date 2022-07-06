package com.cwd.factory.method;

import com.cwd.factory.simple.ChickenHamburg;
import com.cwd.factory.simple.Hamburg;
import com.cwd.factory.simple.PigHamburg;

//由子类组装
public class Sub1 extends HamburgFactory {
    @Override
    public Hamburg build(String type) {
        Hamburg hamburg = null;

        if ("chicken".equals(type)) {
            hamburg = new ChickenHamburg();
        }
        if ("pig".equals(type)) {
            hamburg = new PigHamburg();
        }

        return hamburg;
    }
}
