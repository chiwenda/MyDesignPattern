package com.cwd.strategy;

public class Main {
    public static void main(String[] args) {
        RoleA cwd = new RoleA("cwd");
        cwd.setAttackBehavior(new Attack1())
                .setDefendBehavior(new Defend1())
                .setRunBehavior(new Run1());
        cwd.run();
        cwd.attack();
        cwd.defend();
    }
}
