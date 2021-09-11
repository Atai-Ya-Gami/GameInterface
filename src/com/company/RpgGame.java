package com.company;


import com.company.boss.Boss;
import com.company.users.*;

public class RpgGame {
    public static void PrintStatistic(Hero heroes[], Boss boss){
        System.out.println("-------------------");
        System.out.println("Boss health: " + boss.getHealth());
        for (Hero hero : heroes) {
            System.out.println("Hero " + hero.getClass().getSimpleName()
                    + " current health: " + hero.getHealth());
        }
        System.out.println("-------------------");
    }
    public static void StartGame(){
        Hero heroes[] = createHeroes();
        Boss boss = new Boss(490,30);
        PrintStatistic(heroes,boss);
        while(!isFinish(heroes,boss)){
            round(heroes,boss);
        }
    }
    private static Hero[] createHeroes(){
        Hero heroes[] = new Hero[4];
        heroes[0] = new Hunter(100,10);
        heroes[1] = new Magical(100,10);
        heroes[2] = new Medic(100,10);
        heroes[3] = new Warrior(100,10);
        return heroes;


    }
    private static void appleAbility(Hero heroes[], Boss boss) {
        for(Hero hero: heroes){
            hero.useAbility(heroes, boss);
        }
    }
    private static boolean isFinish(Hero heroes[], Boss boss) {
        if (boss.getHealth() <= 0) {
            return true;
        }
        boolean allHeroesDead = true;
        for (Hero hero : heroes) {
            if (hero.getHealth() > 0) {
                allHeroesDead = false;
                break;
            }

        }
        return allHeroesDead;
    }
    private static void round(Hero heroes[], Boss boss){
        BossHits(heroes,boss);
        if(isFinish(heroes,boss)){
            PrintStatistic(heroes,boss);
        }
        HeroesHits(heroes,boss);
        appleAbility(heroes,boss);
        appleAbility(heroes,boss);

    }

    private static void HeroesHits(Hero heroes[], Boss boss) {
        for (Hero hero : heroes) {
            int heroDamage = hero.getDamage();
            boss.PutDamage(heroDamage);
            System.out.println("Hero " + hero.getClass().getSimpleName() + " attack boss:" + heroDamage);

        }
        System.out.println("-------------------");
    }

    private static void BossHits(Hero heroes[], Boss boss) {
        for (Hero hero : heroes) {
            int BossDamage = boss.getAttack();
            hero.PutDamage(BossDamage);
            System.out.println("Boss attack hero" + hero.getClass().getSimpleName() + ": " + BossDamage);

        }
        System.out.println("-------------------");
    }
}
