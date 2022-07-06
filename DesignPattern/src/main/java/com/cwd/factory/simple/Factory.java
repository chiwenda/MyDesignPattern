package com.cwd.factory.simple;

public class Factory {

    public Hamburg build(String type) {
        Hamburg hamburg = null;

        if ("pig".equals(type)) {
            hamburg = new PigHamburg();
        }
        if ("chicken".equals(type)) {
            hamburg = new ChickenHamburg();
        }
        return hamburg;
    }
}
