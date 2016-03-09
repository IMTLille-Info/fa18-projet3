package com.towerdefense.game.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.towerdefense.game.MyGdxGame;

public class DesktopLauncher implements ApplicationListener {

	private SpriteBatch batch;
	private Texture texture;
	private Sprite sprite;

	public void create(){
		batch = new SpriteBatch();
		texture = new Texture(Gdx.files.internal("Tower_defense_map.jpg"));
		sprite = new Sprite(texture);
	}

	public void dispose() {
		batch.dispose();
		texture.dispose();
	}

	public void render(){
		Gdx.gl.glClearColor(1,1,1,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		sprite.draw(batch);
		batch.end();
	}

	public void resize(int width, int height) {
	}

	public void pause() {
	}

	public void resume() {
	}

    public static void main (String[] arg) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title="Tower defense Game";
        config.width=1920;
        config.height=1080;
        new LwjglApplication(new DesktopLauncher(), config);

    }
}
