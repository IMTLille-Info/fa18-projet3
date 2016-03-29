package com.towerdefense.game.Unit;

import com.badlogic.gdx.graphics.Texture;
import com.towerdefense.game.map.Map;

/**
     * Created by Félix on 10/03/2016.
     * abstract class for the Units
     */

public abstract class Units {

    private int life;
    private int currentLife;
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

    public int getCurrentLife() {
        return currentLife;
    }

    public void setCurrentLife(int currentLife) {
        this.currentLife = currentLife;
    }

    public void damage(int damage){
        currentLife -= damage;
        if (currentLife < 0)
            currentLife = 0;
    }

}
