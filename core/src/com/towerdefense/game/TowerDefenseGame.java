package com.towerdefense.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.towerdefense.game.Unit.BasicUnit;
import com.towerdefense.game.map.Map;
import com.towerdefense.game.tower.TowerBasic;


public class TowerDefenseGame implements ApplicationListener {

    private SpriteBatch batch;

    private Texture texture;
    private Sprite skin;
    private Map map;
    private char menuChoice;
    private boolean menuTouched = false;

    private BuyTower menu;


    private static final int FRAME_COLS = 8;
    private static final int FRAME_ROWS = 1 ;

    Animation movingAnimation;
    Texture movingSheet;
    TextureRegion[] movingFrames;
    //SpriteBatch batch;
    TextureRegion currentFrame;

    float stateTime;

    TowerBasic basicTower;
    BasicUnit basicUnit;

    public void create() {

        map = new Map();
        menu = new BuyTower();

        int width = map.getWidth();
        int height = map.getHeight();



        batch = new SpriteBatch();
        //texture = new Texture();
        //sprite = new Sprite();

        basicTower = new TowerBasic(10, 10, 40, 40);
        basicUnit = new BasicUnit(10, 300,2);

        movingSheet = new Texture(Gdx.files.internal("MulticolorTanks.png"));
        TextureRegion[][] tmp = TextureRegion.split(movingSheet, movingSheet.getWidth()/FRAME_COLS, movingSheet.getHeight()/FRAME_ROWS);
        movingFrames = new TextureRegion[FRAME_COLS * FRAME_ROWS];
        int index = 0;
        for (int i = 0; i < FRAME_ROWS; i++) {
            for (int j = 0; j < FRAME_COLS; j++) {
                movingFrames[index++] = tmp[i][j];
            }
        }
        movingAnimation = new Animation(0.2f, movingFrames);
        batch = new SpriteBatch();
        stateTime = 0f;





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
                    if (menuTouched && map.isFreeSpace(screenY / 40, screenX / 40)){
                        map.placeTower(menuChoice,screenY / 40, screenX / 40);
                        menuTouched = false;
                    }
                    System.out.print("x: " + screenX / 40 + " y: " + screenY / 40 + " ");
                    System.out.println(map.isFreeSpace(screenY / 40, screenX / 40));
                    //Sprite skin = new Sprite(new Texture("tour rouge 3.jpg"));
                }
                //TODO gestion click sur les tours du menu
                if ((screenX > 820)&&(screenX<860)){
                    if ((screenY>40)&&(screenY<80)) {
                        //tour rouge
                        menuTouched = true;
                        menuChoice = 'r';
                    }
                    else if ((screenY>120)&&(screenY<160)) {
                        //tour orange
                        menuTouched = true;
                        menuChoice = 'o';
                    }
                    else if ((screenY>200)&&(screenY<240)) {
                        //tour jaune
                        menuTouched = true;
                        menuChoice = 'y';
                    }
                    //System.out.println("screenX = [" + screenX + "], screenY = [" + screenY + "], pointer = [" + pointer + "], button = [" + button + "]");

                }
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
        //batch.begin();
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
        stateTime += Gdx.graphics.getDeltaTime();
        currentFrame = movingAnimation.getKeyFrame(stateTime, true);

        //sprite.setSize(width,height);
       //sprite.draw(batch);


        //batch.draw(getTexture(), getPosition()[0], getPosition()[1]);
        map.draw(batch);
        menu.draw(batch);



        batch.draw(currentFrame, 2, 280);

        // basicTower.draw(batch);
       //basicUnit.draw(batch);
        //batch.end();
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