package com.towerdefense.game.tower;

/**
 * Created by Yonni on 10/03/2016.
 * abstract class for the towers
 */
public abstract class Tower {
    private float range;
    private float damage;
    private int position[];

    public Tower(){
    }

    public float getRange() {
        return range;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public void setRange(float range) {
        this.range = range;
    }
}
