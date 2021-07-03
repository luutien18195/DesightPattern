package com.behavior.strategy.character_example;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use knife");
    }
}
