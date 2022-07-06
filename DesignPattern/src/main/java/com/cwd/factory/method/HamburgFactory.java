package com.cwd.factory.method;

import com.cwd.factory.simple.Hamburg;

//工厂方法模式组合类变成抽象
public abstract class HamburgFactory {

    public abstract Hamburg build(String type);


    public Hamburg sell(String type) {
        Hamburg hamburg = build(type);

        hamburg.prepare();
        hamburg.fire();
        hamburg.pack();

        return hamburg;
    }

}
