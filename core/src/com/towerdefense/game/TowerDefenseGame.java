package com.towerdefense.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.towerdefense.game.Unit.BasicUnit;
import com.towerdefense.game.map.Map;
import com.towerdefense.game.tower.TowerBasic;


public class TowerDefenseGame implements ApplicationListener {

    private SpriteBatch batch;

    private Texture texture;
    private Sprite skin;
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

        Gdx.input.setInputProcessor(new InputProcessor() {
            @Override
            public boolean keyDown(int keycode) {
                return false;
            }

            @Override
            public boolean keyUp(int keycode) {
                return false;
            }

            @Override
            public boolean keyTyped(char character) {
                return false;
            }

            @Override
            public boolean touchDown(int screenX, int screenY, int pointer, int button) {
                if ((screenX < 20*40)&&(screenY<15*40)) {
                    System.out.print("x: " + screenX / 40 + " y: " + screenY / 40 + " ");
                    System.out.println(map.isFreeSpace(screenY / 40, screenX / 40));
                    //Sprite skin = new Sprite(new Texture("tour rouge 3.jpg"));
                }
                //TODO gestion click sur les tours du menu


                return false;
            }

            @Override
            public boolean touchUp(int screenX, int screenY, int pointer, int button) {
                return false;
            }

            @Override
            public boolean touchDragged(int screenX, int screenY, int pointer) {
                return false;
            }

            @Override
            public boolean mouseMoved(int screenX, int screenY) {
                return false;
            }

            @Override
            public boolean scrolled(int amount) {
                return false;
            }
        });

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