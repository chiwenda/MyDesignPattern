package com.cwd.factory.simple;

//汉堡抽象
public abstract class Hamburg {

    protected String name;


    //准备
    public void prepare() {
        System.out.println(String.format("%s汉堡准备着...",name));
    }

    public void pack() {
        System.out.println(String.format("%s汉堡打包中...",name));
    }

    //制作
    public void fire() {
        System.out.println(String.format("%s汉堡制作中...",name));
    }
}
