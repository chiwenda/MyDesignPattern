package com.cwd.observe;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务者
 */
public class Service implements Subject {

    //订阅者列表
    private List<Observe> observes = new ArrayList<Observe>();

    private String msg;


    public void register(Observe observe) {
        //消费者订阅服务者
        observes.add(observe);
    }

    public void remove(Observe observe) {
        //移除订阅者
        int index = observes.indexOf(observe);
        if (index >= 0) {
            observes.remove(index);
        }
    }

    public void notifyObserve() {
        observes.forEach(observe -> {
            observe.update(msg);
        });
    }

    /**
     * 更新并通知订阅者
     */
    public void setMsg(String msg) {
        this.msg = msg;
        notifyObserve();
    }
}
