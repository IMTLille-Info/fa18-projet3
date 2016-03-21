package com.towerdefense.game.Unit;

import com.badlogic.gdx.graphics.Texture;

/**
     * Created by Félix on 10/03/2016.
     * abstract class for the Units
     */

public abstract class Units {

    private int life;
    protected float speed;
    private int position[];
    private Texture texture;


    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }


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

    public void damage(int damage){
        life -= damage;
        if (life < 0)
            life = 0;
    }
}
