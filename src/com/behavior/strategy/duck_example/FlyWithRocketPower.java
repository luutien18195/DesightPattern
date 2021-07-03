package com.behavior.strategy.duck_example;

public class FlyWithRocketPower implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with rocket");
    }
}
