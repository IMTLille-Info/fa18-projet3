package com.towerdefense.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.towerdefense.game.TowerDefenseGame;

import java.awt.*;

public class DesktopLauncher{


    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        // Get Screen Size to adapt app to user screen's resolution
        GraphicsDevice graphdev = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width=graphdev.getDisplayMode().getWidth();
        int height=graphdev.getDisplayMode().getHeight();
        config.title="Tower Defense Game";
        config.width=width;
        config.height=height;
        new LwjglApplication(new TowerDefenseGame(), config);
    }
}
