package com.cwd.factory.simple;

public class Main {
    public static void main(String[] args) {
        HamburgFactory hamburgFactory = new HamburgFactory(new Factory());
        hamburgFactory.sell("pig");
        hamburgFactory.sell("chicken");
    }
}
