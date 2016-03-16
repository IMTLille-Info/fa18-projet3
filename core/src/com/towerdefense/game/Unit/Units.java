package com.towerdefense.game.Unit;

    /**
     * Created by Félix on 10/03/2016.
     * abstract class for the Units
     */

public abstract class Units {

    private int life;
    protected float speed;
    private int position[];

    public Units(){
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }
}
