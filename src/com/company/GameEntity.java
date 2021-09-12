package com.company;

import java.util.Random;

public abstract class GameEntity {

    protected int Health;
    protected int Damage;

    public GameEntity(int health, int damage) {
        Health = health;
        Damage = damage;
    }
    public int PutDamage(int Damage){
        this.Health = this.Health - Damage;
        return this.Health;
    }
    public int getAttack(){
        int SomeNum = new Random().nextInt(3) +1 ;
        return this.Damage * SomeNum;
    }
    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
}
