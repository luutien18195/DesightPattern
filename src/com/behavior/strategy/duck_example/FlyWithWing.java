package com.behavior.strategy.duck_example;

import com.behavior.strategy.duck_example.IFlyBehavior;

public class FlyWithWing implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flyyyyyyyy");
    }
}
