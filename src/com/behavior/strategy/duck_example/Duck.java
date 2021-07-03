package com.behavior.strategy.duck_example;

public abstract class Duck {

    protected IFlyBehavior flyBehavior;

    public Duck() {
    }

    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void fly() {
        flyBehavior.fly();
    }
}
