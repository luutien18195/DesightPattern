package com.behavior.strategy.duck_example;

import com.behavior.strategy.duck_example.client.ModelDuck;

public class DuckApp {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.fly();

        model.setFlyBehavior(new FlyWithRocketPower());
        model.fly();
    }
}
