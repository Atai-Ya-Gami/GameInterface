package com.company.players;

import com.company.HavingAbility;
import com.company.players.Hero;

public class Medic extends Hero {
    public Medic(int health, int damage) {
        super(health, damage, HavingAbility.HEAL);
    }

    @Override
    public void useAnility(Hero[] heroes) {
        System.out.println("Medic использует супер способность HEAL");
    }
}
