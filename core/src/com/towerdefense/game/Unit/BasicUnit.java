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

    public BasicUnit(int posX, int posY, int life){
        super();
        this.setLife(life);
        this.setPosition(new int[]{posX, posY});
        setTexture(new Texture("tank.jpg"));
    }



    public void display(SpriteBatch batch) {
        batch.draw(getTexture(), getPosition()[0], getPosition()[1]);
        getPosition()[0]++;
    }
}
