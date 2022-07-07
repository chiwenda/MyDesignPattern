package com.cwd.strategy;

//角色基类
public abstract class Role {

    protected String name;

    protected IAttackBehavior attackBehavior;

    protected IRunBehavior runBehavior;

    protected IDisplayBehavior displayBehavior;

    protected IDefendBehavior defendBehavior;


    public Role setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
        return this;
    }

    public Role setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
        return this;
    }

    public Role setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
        return this;
    }


    protected void display() {
        displayBehavior.display();
    }

    protected void run() {
        runBehavior.run();
    }

    protected void attack() {
        attackBehavior.attack();
    }

    protected void defend() {
        defendBehavior.defend();
    }
}
