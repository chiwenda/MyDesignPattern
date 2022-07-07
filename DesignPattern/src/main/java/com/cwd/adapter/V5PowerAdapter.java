package com.cwd.adapter;

public class V5PowerAdapter implements V5Power {

    private V220Power v220Power;

    public V5PowerAdapter(V220Power v220Power) {
        this.v220Power = v220Power;
    }

    @Override
    public int provideV5Power() {
        this.v220Power.provideV220Power();
        System.out.println("转5v");
        return 5;
    }
}
