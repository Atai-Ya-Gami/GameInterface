package com.company.players;
import com.company.GameAntity;
import com.company.HavingAbility;
import com.company.IAbility;

public abstract class Hero extends GameAntity implements IAbility {
    public Hero(int health, int damage) {
        super(health, damage);
    }
    private HavingAbility ApplyAbility;

    public HavingAbility getApplyAbility() {
        return ApplyAbility;
    }

    public void setApplyAbility(HavingAbility applyAbility) {
        ApplyAbility = applyAbility;
    }

    public Hero(int health, int damage, HavingAbility applyAbility) {
        super(health, damage);
        ApplyAbility = applyAbility;
    }

}
