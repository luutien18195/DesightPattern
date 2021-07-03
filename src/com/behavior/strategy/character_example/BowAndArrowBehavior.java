package com.behavior.strategy.character_example;

public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Use bow and arrow");
    }
}
