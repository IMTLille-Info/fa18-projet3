package com.towerdefense.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.towerdefense.game.Unit.BasicUnit;
import com.towerdefense.game.map.Map;
import com.towerdefense.game.tower.TowerBasic;
import java.awt.*;

public class TowerDefenseGame implements ApplicationListener {

    private SpriteBatch batch;

    private Texture texture;
    private Sprite sprite;
    private Map map;





    TowerBasic basicTower;
    BasicUnit basicUnit;

    public void create() {
        map = new Map();
        int width = map.getWidth();
        int height = map.getHeight();

        batch = new SpriteBatch();
        //texture = new Texture();
        //sprite = new Sprite();

        basicTower = new TowerBasic(10, 10, 40, 40);
        basicUnit = new BasicUnit(10, (map.getHeight()/2), 10);

    }

    public void dispose() {
        batch.dispose();
        //texture.dispose();
    }

    public void render(){
        batch.begin();
        //sprite.setSize(width,height);
        //sprite.draw(batch);
        map.draw(batch);
       // basicTower.draw(batch);
       // basicUnit.draw(batch);
        
        batch.end();

        if (Gdx.input.isKeyPressed(Input.Keys.ESCAPE)){
            Gdx.app.exit();
        }
        if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
            basicUnit.damage(1);
            System.out.println(basicUnit.getLife());
        }


    }

    public void resize(int width, int height) {

    }

    public void pause() {

    }

    public void resume() {
    }

}