package com.towerdefense.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.g3d.particles.batches.BillboardParticleBatch;
import com.towerdefense.game.TowerDefenseGame;
import com.badlogic.gdx.Input.Keys;

import java.awt.*;

public class DesktopLauncher{
    // Get Screen Size to adapt app to user screen's resolution

    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        GraphicsDevice graphdev = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width=graphdev.getDisplayMode().getWidth();
        int height=graphdev.getDisplayMode().getHeight();
        config.title="Tower Defense Game";
        config.width=width;
        config.height=height;
        new LwjglApplication(new TowerDefenseGame(), config);
    }
}
