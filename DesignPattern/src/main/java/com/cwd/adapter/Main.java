package com.cwd.adapter;

public class Main {
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5PowerAdapter v5PowerAdapter = new V5PowerAdapter(new V220Power());
        mobile.inputPower(v5PowerAdapter);
    }
}
