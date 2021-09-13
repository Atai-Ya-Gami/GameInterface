package com.company;

public class GameAntity {
    protected int Health;
    protected int Damage;

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

    public GameAntity(int health, int damage) {
        Health = health;
        Damage = damage;
    }
}