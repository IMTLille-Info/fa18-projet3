package com.towerdefense.game.Unit;

/**
 * Created by Félix on 10/03/2016.
 * basic class for the basicUnit
 */

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.towerdefense.game.map.Map;

public class BasicUnit extends Units {

    public BasicUnit(int posX, int posY, int life){
        super();
        this.setLife(life);
        this.setPosition(new int[]{posX, posY});
        setTexture(new Texture("tank.jpg"));
    }


    public void draw(SpriteBatch batch) {
        batch.draw(getTexture(), getPosition()[0], getPosition()[1]);
    }

}
