package com.towerdefense.game.tower;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by Yonni on 10/03/2016.
 * the basic tower don't have any specs just shoot ank kill
 */

public class TowerBasic extends Tower{

    private Texture texture;

    public TowerBasic(int damage, int range, int posX, int posY){
        super();
        this.setPosition(new int[]{posX, posY});
        this.setDamage(damage);
        this.setRange(range);
        texture = new Texture("test.png");
    }
    public void draw(SpriteBatch batch){
        batch.draw(texture, getPosition()[0], getPosition()[1]);
    }

}
