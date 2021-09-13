package com.company.players;

import com.company.HavingAbility;
import com.company.players.Hero;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, HavingAbility.CRITICAL_PUNCH);
    }

    @Override
    public void useAnility(Hero[] heroes) {
        System.out.println("Warrior использует супер способность CRITICAL PUNCH");

    }
}
