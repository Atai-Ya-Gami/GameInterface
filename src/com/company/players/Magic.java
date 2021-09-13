package com.company.players;

import com.company.HavingAbility;
import com.company.players.Hero;

public class Magic extends Hero {
    public Magic(int health, int damage) {
        super(health, damage, HavingAbility.BOOST);
    }

    @Override
    public void useAnility(Hero[] heroes) {
        System.out.println("Magic использует супер способность BOOST");

    }
}
