package com.towerdefense.game.Unit;

/**
 * Created by Félix on 10/03/2016.
 * basic class for the basicUnit
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.sun.xml.internal.ws.dump.LoggingDumpTube;

import javax.swing.text.Position;

public class BasicUnit extends Units {

    private Texture texture;


    public BasicUnit(int posX, int posY){
        super();
        this.setPosition(new int[]{posX, posY});
        texture = new Texture("tank.jpg");
    }

    private int life = 10;
    public int Life(){

        if (Gdx.input.isKeyPressed(Input.Keys.SPACE)){
            life--;
        }
        return life;
    }

    public void display(SpriteBatch batch) {
        batch.draw(texture, getPosition()[0], getPosition()[1]);
        getPosition()[0]++;
    }
}
