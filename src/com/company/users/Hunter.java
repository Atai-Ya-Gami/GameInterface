package com.company.users;

import com.company.AbilityType;
import com.company.boss.Boss;

public class Hunter extends Hero{
     public Hunter(int health, int damage) {
        super(health, damage, AbilityType.CRITICAL);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {

    }
}
