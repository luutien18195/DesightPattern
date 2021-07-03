package com.behavior.strategy.character_example;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use sword");
    }
}
