package com.cwd.factory.method;

import com.cwd.factory.simple.ChickenHamburg;
import com.cwd.factory.simple.Hamburg;
import com.cwd.factory.simple.PigHamburg;

public class Sub2 extends HamburgFactory{
    @Override
    public Hamburg build(String type) {
        Hamburg hamburg = null;

        if ("chicken".equals(type)) {
            hamburg = new ChickenHamburg();
        }
        if ("pig".equals(type)) {
            hamburg = new PigHamburg();
        }
        if("七虾堡".equals(type)){
            //
        }
        return hamburg;
    }
}
