package com.behavior.strategy.character_example.client;

import com.behavior.strategy.character_example.Character;
import com.behavior.strategy.character_example.KnifeBehavior;

public class King extends Character {
    public King() {
        weaponBehavior = new KnifeBehavior();
    }
}
