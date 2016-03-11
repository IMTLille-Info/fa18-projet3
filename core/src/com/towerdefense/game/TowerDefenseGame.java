package com.towerdefense.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.towerdefense.game.Unit.BasicUnit;
import com.towerdefense.game.tower.TowerBasic;

import java.awt.*;

public class TowerDefenseGame implements ApplicationListener {

    private SpriteBatch batch;
    private Texture texture;
    private Sprite sprite;
    TowerBasic basicTower;
    BasicUnit basicUnit;

    public void create(){
        batch = new SpriteBatch();
        texture = new Texture(Gdx.files.internal("Tower_defense_map.jpg"));
        sprite = new Sprite(texture);
        basicTower = new TowerBasic(10,10,40,40);
        basicUnit = new BasicUnit();
        }

    public void dispose() {
        batch.dispose();
        texture.dispose();
    }

    public void render(){
        batch.begin();
        GraphicsDevice graphdev = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width=graphdev.getDisplayMode().getWidth();
        int height=graphdev.getDisplayMode().getHeight();
        sprite.setSize(width,height);
        sprite.draw(batch);
        basicTower.display(batch);
        basicUnit.display(batch);
        batch.end();
    }


    public void resize(int width, int height) {

    }

    public void pause() {
    }

    public void resume() {
    }

}