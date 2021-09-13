package com.company;

import com.company.players.Hero;
import com.company.players.Magic;
import com.company.players.Medic;
import com.company.players.Warrior;



public class Main {


    public static void main(String[] args) {
        Statistic(createHeroes());
        appleAbility(createHeroes());

    }
    public static void Statistic(Hero heroes[]) {
        System.out.println("------------------------");
        for (Hero hero : heroes) {
            System.out.println("Hero " + hero.getClass().getSimpleName()
                    + " current health: " + hero.getHealth());
        }
        for (Hero hero : heroes) {
            System.out.println("Hero " + hero.getClass().getSimpleName()
                    + " damage: " + hero.getDamage());
        }
        System.out.println("------------------------");
    }
    private static void DOSome(){
        Hero heroes [] = createHeroes();
    }
    private static Hero[] createHeroes() {
        Hero heroes[] = new Hero[3];
        heroes[0] = new Magic(100, 15);
        heroes[1] = new Medic(80, 5);
        heroes[2] = new Warrior(120, 20);
        return heroes;
    }

    private static void appleAbility(Hero heroes[]) {
        for (Hero hero : heroes) {
            hero.useAnility(heroes);

        }
        System.out.println("------------------------");
    }
}
