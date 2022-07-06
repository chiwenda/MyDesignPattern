package com.cwd.singleton.hangry;

//饿汉式
public class SingleTon1 {
    private static SingleTon1 instance = new SingleTon1();


    private SingleTon1() {
    }

    public static SingleTon1 getInstance() {
        return instance;
    }
}
