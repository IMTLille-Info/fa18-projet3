package com.towerdefense.game.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

/**
 * Created by Yonni  on 21/03/2016.
 */
public class Map {

    private char map[][];

    private int width, height;
    Texture blanc;
    Texture vert;
    int resolution = 40;


    public Map(){
        //map = new char[3][4];

        map = new char[][]{
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'v','v','v','v','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','v','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'v','x','x','v','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','v','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'v','x','x','v','v','v','v','v','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','x','x','x','x','v','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'v','x','x','v','x','x','x','v','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','x','x','x','x','v','v','v','v','v','v','v','v','v','v','v','v','v'},
                {'v','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'v','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'v','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'v','v','v','v','v','v','v','v','x','x','x','x','x','x','x','x','x','x','x','x'},
        };
        width = 20 * resolution;
        height = 15* resolution;
        blanc = new Texture("blanc.jpg");
        vert = new Texture("vert.jpg");
        //Sprite sprite = new Sprite();
    }



    public boolean isFreeSpace(){
        int maxI = map.length;//ligne
        //System.out.print(map.length);
        int maxJ = map[0].length;//colonne

        for (int i = 0; i < maxI; i++) {
            for (int j = 0; j < maxJ; j++) {
                if (map[i][j] == 'x')
                    return true;
            }
        }
        return false;
    }



    public void draw(SpriteBatch batch){
        int maxI = map.length;//ligne
        //System.out.print(map.length);
        int maxJ = map[0].length;//colonne
        //System.out.println(maxI + "" + maxJ);

        for (int i = 0; i < maxI ; i++){
            for (int j = 0; j < maxJ; j++){
                if (map[i][j]=='x') {
                    batch.draw(vert, j * width / maxJ, (maxI-1-i) * height / maxI, width / 20, height / 15);
                }
                else if(map[i][j]=='v') {
                    batch.draw(blanc, j * width / maxJ, (maxI-1-i) * height / maxI, width / 20, height / 15);
                }
            }
        }

    }

    public char[][] getMap() {
        return map;
    }

    public void setMap(char[][] map) {
        this.map = map;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
