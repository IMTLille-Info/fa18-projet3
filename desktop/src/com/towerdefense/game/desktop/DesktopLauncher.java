package com.towerdefense.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.towerdefense.game.TowerDefenseGame;

import java.awt.*;

public class DesktopLauncher{


    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        int width = 20*40;
        int height = 15*40;
        config.title="Tower Defense Game";
        config.width= width;
        config.height=height;
        new LwjglApplication(new TowerDefenseGame(), config);
    }
}
