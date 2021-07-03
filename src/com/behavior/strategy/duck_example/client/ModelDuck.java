package com.behavior.strategy.duck_example.client;

import com.behavior.strategy.duck_example.Duck;
import com.behavior.strategy.duck_example.FlyNoWay;
import com.behavior.strategy.duck_example.IFlyBehavior;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        super.setFlyBehavior(flyBehavior);
    }
}
