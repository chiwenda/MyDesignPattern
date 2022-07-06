package com.cwd.singleton.lazy;

import java.util.Objects;

//双重校验锁
public class SingleTon2 {
    private static SingleTon2 instance = null;


    private SingleTon2() {
    }

    public static SingleTon2 getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (SingleTon2.class) {
                if (Objects.isNull(instance)) {
                    instance = new SingleTon2();
                }
            }
        }
        return instance;
    }
}
