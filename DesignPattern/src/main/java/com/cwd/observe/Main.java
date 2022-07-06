package com.cwd.observe;

public class Main {
    public static void main(String[] args) {
        //服务者
        Service service = new Service();
        //订阅者，注册到服务者
        Observe1 observe1 = new Observe1(service);
        Observe2 observe2 = new Observe2(service);

        service.setMsg("阿巴阿巴");
        service.setMsg("莫西莫西");
    }
}
