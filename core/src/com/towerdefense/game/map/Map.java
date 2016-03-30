package com.towerdefense.game.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.Texture;
import com.sun.corba.se.impl.util.SUNVMCID;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.List;
import java.awt.Point;

/**
 * Created by Yonni  on 21/03/2016.
 */
public class Map {

    private char map[][];

    private ArrayList<Point> wayPoints;

    private int width, height;

    private int nbWayPoint;
    Texture blanc;
    Texture vert;
    Texture orangeTower;
    Texture redTower;
    Texture yellowTower;
    Texture menu;
    final int resolution = 40;

    public Map(){

        /*
        * x = free space
        * c = mob road U = UP D = DOWN R = RIGHT L = LEFT -> use for initWaypoint
        * y = yellow tower
        * o = orange tower
        * r = red tower
        * S = Start E = End
        */


        map = new char[][]{
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','R','c','c','c','D','x','x','x','R','c','c','c','D','x','x','x','x','x','x'},
                {'x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','x','x','x'},
                {'x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','x','x','x'},
                {'x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','x','x','x'},
                {'x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','x','x','x'},
                {'S','U','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','R','c','E'},
                {'x','x','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x'},
                {'x','x','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x'},
                {'x','x','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x'},
                {'x','x','x','x','x','c','x','x','x','c','x','x','x','c','x','x','x','c','x','x'},
                {'x','x','x','x','x','R','c','c','c','U','x','x','x','R','c','c','c','U','x','x'},
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
                {'x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x','x'},
        };
        width       = 20 * resolution;
        height      = 15 * resolution;
        //System.out.println(map[7][1]);

        wayPoints = new ArrayList<Point>();
        initWaypoint();


        //Texture init
        blanc       = new Texture("blanc.jpg");
        vert        = new Texture("vert.jpg");
        orangeTower = new Texture("tour orange 3.jpg");
        redTower    = new Texture("tour rouge 3.jpg");
        yellowTower = new Texture("tour jaune 3.jpg");
        menu        = new Texture("backgroundMenu.jpg");

        //Sprite sprite = new Sprite();
    }

    public boolean isFreeSpace(int i, int j){
        if (map[i][j] == 'x')
            return true;
        return false;
    }
    public void placeTower(char tower,int i, int j){
        map[i][j] = tower;

    }


    public void draw(SpriteBatch batch) {
        int maxI = map.length;//ligne
        //System.out.print(map.length);
        int maxJ = map[0].length;//colonne
        //System.out.println(maxI + "" + maxJ);
        //batch.draw(menu,0,20*40);


        for (int i = 0; i < maxI; i++) {
            for (int j = 0; j < maxJ; j++) {
                int scaledWidth = j * width / maxJ;
                int scaledHeight = (maxI - 1 - i) * height / maxI;

                if (map[i][j] == 'x') {
                    batch.draw(vert, scaledWidth, scaledHeight, width / 20, height / 15);

                } else if (map[i][j] == 'o') {
                    batch.draw(orangeTower, scaledWidth, scaledHeight, width / 20, height / 15);

                } else if (map[i][j] == 'y') {
                    batch.draw(yellowTower, scaledWidth, scaledHeight, width / 20, height / 15);

                } else if (map[i][j] == 'r') {
                    batch.draw(redTower, scaledWidth, scaledHeight, width / 20, height / 15);

                } else {
                    batch.draw(blanc, scaledWidth, scaledHeight, width / 20, height / 15);
                }
            }
            batch.draw(menu, width, 0);
        }
       // Affichage des waypoints pour Debug
        for (Point p : wayPoints){
            batch.draw(new Texture("monster.jpg"),(int)p.getY()*40,(int)p.getX()*40 );
        }
    }

    public void initWaypoint() {
        int i = 0, j = 0;
        char lastDirection;
        //Recherche du debut du chemin
        for (i = 0; i < 15; i++) {
            for (j = 0; j < 20; j++) {
                if (map[i][j] == 'S') {
                    wayPoints.add(new Point(i, j));
                }
            }
        }
        i = wayPoints.get(0).x;
        j = wayPoints.get(0).y;

        while ((map[i][j] != 'U')&&(map[i][j] != 'D')){
            boolean test = map[i][j] != 'U';
            j++;
        }
        lastDirection = map[i][j]; // on affecte la direction
        wayPoints.add(new Point(i,j)); // on ajoute un waypoint par la suite
        while (map[i][j] != 'E'){
            switch (lastDirection){
                case 'U':
                    i--;
                    if ((map[i][j] == 'R')||(map[i][j] == 'L')||(map[i][j]=='E')){
                        wayPoints.add(new Point(14-i,j));
                        lastDirection = map[i][j];
                    }
                    break;
                case 'D':
                    i++;
                    if ((map[i][j] == 'R')||(map[i][j] == 'L')||(map[i][j]=='E')){
                        wayPoints.add(new Point(14-i,j));
                        lastDirection = map[i][j];
                    }
                    break;
                case 'R':
                    j++;
                    if ((map[i][j] == 'U')||(map[i][j] == 'D')||(map[i][j]=='E')){
                        wayPoints.add(new Point(14-i,j));
                        lastDirection = map[i][j];
                    }
                    break;
                case 'L':
                    j--;
                    if ((map[i][j] == 'U')||(map[i][j] == 'D')||(map[i][j]=='E')){
                        wayPoints.add(new Point(14-i,j));
                        lastDirection = map[i][j];
                    }
                    break;
            }
        }
        nbWayPoint = wayPoints.size();
        //affichage des waypoints en texte
        /*for (Point p : wayPoints){
            System.out.println("x = "+p.getX()*40+" y = "+p.getY()*40);
        }*/
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

    public int getNbWayPoint() {
        return nbWayPoint;
    }

    public void setNbWayPoint(int nbWayPoint) {
        this.nbWayPoint = nbWayPoint;
    }


    public ArrayList<Point> getWayPoints() {
        return wayPoints;
    }

    public void setWayPoints(ArrayList<Point> wayPoints) {
        this.wayPoints = wayPoints;
    }


}
