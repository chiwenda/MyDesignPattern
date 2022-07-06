package com.cwd.singleton.hangry;

//饿汉式写法2
public class SingleTon2 {

    private static SingleTon2 instance = null;

    static {
        instance = new SingleTon2();
    }

    private SingleTon2() {
    }


    public static SingleTon2 getInstance() {
        return instance;
    }
}
