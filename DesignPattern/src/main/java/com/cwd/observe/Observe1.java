package com.cwd.observe;

/**
 * 订阅者1
 */
public class Observe1 implements Observe {

    private Subject subject;

    public Observe1(Subject subject) {
        this.subject = subject;
        //注册订阅者
        subject.register(this);
    }

    @Override
    public void update(String msg) {
        System.out.println(String.format("订阅者1号获取订阅更新消息:%s", msg));
    }
}
