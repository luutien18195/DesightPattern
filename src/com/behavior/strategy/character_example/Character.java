package com.behavior.strategy.character_example;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;

    public Character() {
    }

    public Character(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void fight() {
        this.weaponBehavior.useWeapon();
    }
}
