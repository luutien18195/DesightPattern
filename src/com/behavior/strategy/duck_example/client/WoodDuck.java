package com.behavior.strategy.duck_example.client;

import com.behavior.strategy.duck_example.Duck;
import com.behavior.strategy.duck_example.FlyNoWay;

public class WoodDuck extends Duck {
    public WoodDuck() {
        flyBehavior = new FlyNoWay();
    }
}
