package com.cwd.adapter;

public class Mobile {

    public void inputPower(V5Power power){
        int i = power.provideV5Power();
        System.out.println("现在电压是:"+i);
    }
}
