package com.company.users;

import com.company.AbilityType;
import com.company.boss.Boss;

import java.util.Random;

public class Magical extends Hero{
    public Magical(int health, int damage) {
        super(health, damage, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for(Hero hero: heroes){
            int SomeNum = new Random().nextInt(10);

            hero.setDamage(getDamage() + SomeNum) ;
        }
    }
}
