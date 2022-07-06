package com.cwd.observe;

public class Observe2 implements Observe {

    private Subject subject;

    public Observe2(Subject subject) {
        this.subject = subject;
        subject.register(this);
    }


    @Override
    public void update(String msg) {
        System.out.println(String.format("订阅者2号获取订阅更新消息:%s", msg));
    }
}
