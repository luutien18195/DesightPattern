package com.behavior.strategy.character_example;

public class AxeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use axe");
    }
}
