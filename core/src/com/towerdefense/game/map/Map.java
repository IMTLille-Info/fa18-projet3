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
    Texture orangeTower;
    Texture redTower;
    Texture yellowTower;
    int resolution = 40;


    public Map(){

        /*
        * x = free space
        * c = mob road
        * y = yellow tower
        * o = orange tower
        * r = red tower
        */

        map = new char[][]{
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','c','c','c','c','c','x','x','x','c','c','c','c','c','x','x','x','x','x','x'},
                {'x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','x','x','x'},
                {'x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','x','x','x'},
                {'x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','x','x','x'},
                {'x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','x','x','x'},
                {'c','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','c','c'},
                {'x','x','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x'},
                {'x','x','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x'},
                {'x','x','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x'},
                {'x','x','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x'},
                {'x','x','x','x','x','c','c','c','c','c','x','x','x','c','c','c','c','c','x','x'},
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','x','x','x','o','r','y','x','x','x','x','x','x','x','x','x','x','x'},
        };
        width       = 20 * resolution;
        height      = 15 * resolution;
        blanc       = new Texture("blanc.jpg");
        vert        = new Texture("vert.jpg");
        orangeTower = new Texture("tour orange 3.jpg");
        redTower    = new Texture("tour rouge 3.jpg");
        yellowTower = new Texture("tour jaune 3.jpg");

        //Sprite sprite = new Sprite();
    }



    public boolean isFreeSpace(int i, int j){
        if (map[i][j] == 'x')
            return true;
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
                else if(map[i][j]=='c') {
                    batch.draw(blanc, j * width / maxJ, (maxI-1-i) * height / maxI, width / 20, height / 15);
                }
                else if(map[i][j]=='o') {
                    batch.draw(orangeTower, j * width / maxJ, (maxI-1-i) * height / maxI, width / 20, height / 15);
                }
                else if(map[i][j]=='r') {
                    batch.draw(yellowTower, j * width / maxJ, (maxI-1-i) * height / maxI, width / 20, height / 15);
                }
                else if(map[i][j]=='y') {
                    batch.draw(redTower, j * width / maxJ, (maxI-1-i) * height / maxI, width / 20, height / 15);
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
