package com.cwd.observe;

/**
 * 所有被订阅者实现
 */
public interface Subject {

    void register(Observe observe);


    void remove(Observe observe);

    void notifyObserve();
}
