package com.cwd.singleton.inner;

//内部类
public class InnerClass {
    private InnerClass() {
    }

    private static class SingleTonHolder {
        private static InnerClass instance = new InnerClass();
    }

    public static InnerClass getInstance() {
        return SingleTonHolder.instance;
    }
}
