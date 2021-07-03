package com.behavior.strategy.duck_example.client;

import com.behavior.strategy.duck_example.Duck;
import com.behavior.strategy.duck_example.FlyWithWing;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWing();
    }
}
