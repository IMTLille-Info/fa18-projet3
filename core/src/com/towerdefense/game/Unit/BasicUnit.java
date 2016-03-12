package com.towerdefense.game.Unit;

/**
 * Created by serio on 10/03/2016.
 * basic class for the basicUnit
 */

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class BasicUnit extends Units {

    private Texture texture;

    public BasicUnit(){
        super();
        int posX=10,posY=800;

        this.setSpeed(0);
        this.setLife(10);
        this.setPosition(new int[]{posX, posY});
        texture = new Texture("tank.jpg");
    }

    public void display(SpriteBatch batch) {
        batch.draw(texture, getPosition()[0], getPosition()[1]);
    }
}
