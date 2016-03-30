package com.towerdefense.game.tower;

import java.awt.*;

/**
 * Created by Yonni on 10/03/2016.
 * abstract class for the towers
 */
public abstract class Tower {
    private float range;
    private float damage;
    private Point position;
    private char type;
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

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setRange(float range) {
        this.range = range;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }
}
