package com.towerdefense.game.tower;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.awt.*;

/**
 * Created by Yonni on 10/03/2016.
 * the basic tower don't have any specs just shoot ank kill
 */

public class TowerBasic extends Tower{

    private Texture texture;

    public TowerBasic(int damage, int range, int posX, int posY, char type){
        super();
        this.setPosition(new Point(posX, posY));
        this.setDamage(damage);
        this.setRange(range);
        texture = new Texture("test.png");
        this.setType(type);
    }
    public void draw(SpriteBatch batch){
        batch.draw(texture, (int)getPosition().getY(), (int)getPosition().getX());
    }

}
