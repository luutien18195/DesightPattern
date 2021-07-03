package com.behavior.strategy.character_example;

import com.behavior.strategy.character_example.client.King;

public class CharacterApp {
    public static void main(String[] args) {
        King k = new King();
        k.fight(); // use knife
        k.setWeaponBehavior(new SwordBehavior());
        k.fight(); // use swords
    }
}
