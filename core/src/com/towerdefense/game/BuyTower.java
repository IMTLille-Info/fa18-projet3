package com.towerdefense.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yonni on 26/03/2016.
 */
public class BuyTower{

    private List<Sprite> buttons;

    Sprite red,orange,yellow;

    public BuyTower(){
        initialiseButtons();
    }

    public void draw(SpriteBatch batch){
        for(Sprite button : buttons){
            batch.draw(button.getTexture(),button.getX(),button.getY(),40,40);
        }
    }



    public void initialiseButtons(){
        buttons = new ArrayList<Sprite>();

        red = new Sprite(new Texture("tour rouge 3 FB.jpg"));
        red.setPosition(820,520);

        yellow = new Sprite(new Texture("tour jaune 3 FB.jpg"));
        yellow.setPosition(820,360);

        orange = new Sprite(new Texture("tour orange 3 FB.jpg"));
        orange.setPosition(820,440);

        buttons.add(yellow);
        buttons.add(orange);
        buttons.add(red);

    }

}
