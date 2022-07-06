package com.cwd.singleton.lazy;

import java.util.Objects;

//懒汉式
public class SingleTon {

    private static SingleTon instance = null;

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SingleTon();
        }
        return instance;
    }
}
