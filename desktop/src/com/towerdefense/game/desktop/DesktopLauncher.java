package com.towerdefense.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.towerdefense.game.TowerDefenseGame;

public class DesktopLauncher  {

    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title="Tower Defense Game";
        config.width=1920;
        config.height=1080;
        new LwjglApplication(new TowerDefenseGame(), config);
    }
}
