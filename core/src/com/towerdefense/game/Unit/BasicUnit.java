package com.towerdefense.game.Unit;

/**
 * Created by Félix on 10/03/2016.
 * basic class for the basicUnit
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.towerdefense.game.map.Map;

public class BasicUnit extends Units {


    public BasicUnit(int posX, int posY, int life){
        super();
        this.setLife(life);
        this.setPosition(new int[]{posX, posY});
       // setTexture(new Texture("MulticolorTanks.png"));

    }



}
