package com.cwd.factory.simple;

public class HamburgFactory {

    private Factory factory;

    public HamburgFactory(Factory factory) {
        this.factory = factory;
    }


    public Hamburg sell(String type) {
        Hamburg hamburg = factory.build(type);

        hamburg.prepare();
        hamburg.fire();
        hamburg.pack();

        return hamburg;
    }

}
