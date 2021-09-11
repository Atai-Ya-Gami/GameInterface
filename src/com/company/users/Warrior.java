package com.company.users;

import com.company.AbilityType;
import com.company.boss.Boss;

public class Warrior extends Hero {

    public Warrior(int health, int damage) {
        super(health, damage, AbilityType.SAVE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
    boss.setHealth(getHealth() - getDamage());
        System.out.println("Warrior used Super Power");
        System.out.println("-------------------");
    }

}
