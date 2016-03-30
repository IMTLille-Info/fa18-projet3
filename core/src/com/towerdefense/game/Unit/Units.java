package com.towerdefense.game.Unit;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.towerdefense.game.map.Map;

import java.awt.*;
import java.util.ArrayList;

/**
     * Created by Félix on 10/03/2016.
     * abstract class for the Units
     */

public abstract class Units {

    private int life;
    private int lastWayPoint;
    private int nbWayPoints;
    private ArrayList<Point> wayPoints;

    private int currentLife;
    protected float speed;
    private Point coordonees;
    private Texture texture;
    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }


    public Units(){
    }

    public void damage(int damage){
        currentLife -= damage;
        if (currentLife < 0)
            currentLife = 0;
    }
    public void draw(SpriteBatch batch,Map map){
        try {
            if (lastWayPoint == nbWayPoints){
                //System.out.println(lastWayPoint+" "+nbWayPoints);
                map.removeUnit(this);
            }else
            {
                Point lastOne = wayPoints.get(this.lastWayPoint);
                Point nextOne = wayPoints.get(this.lastWayPoint + 1);
                //DEBUG
                //System.out.println(lastOne+" "+nextOne);
                //System.out.println(lastWayPoint);
                //System.out.println(this.getCoordonees());

                if ((this.getCoordonees().getX() == nextOne.getX()*40)&&(this.getCoordonees().getY() == nextOne.getY()*40)){//PROBLEME
                    lastWayPoint++;
                    //System.out.println(lastWayPoint);
                }
                else if (lastOne.getY()==nextOne.getY())
                {
                    //deplacement horizontal
                    if (lastOne.getX() < nextOne.getX())
                    {
                        //deplacement droite
                        this.setCoordonees(new Point((int)this.getCoordonees().getX()+1, (int) this.getCoordonees().getY()));

                    }else
                    {
                        //deplacement gauche
                        this.setCoordonees(new Point((int)this.getCoordonees().getX()-1, (int) this.getCoordonees().getY()));
                    }
                }else
                {
                    //deplacement vertical
                    if (nextOne.getY() < lastOne.getY())
                    {
                        //deplacement haut
                        this.setCoordonees(new Point((int) this.getCoordonees().getX(), (int)this.getCoordonees().getY()-1));

                    }else
                    {
                        //deplacement bas
                        this.setCoordonees(new Point((int) this.getCoordonees().getX(), (int)this.getCoordonees().getY()+1));
                    }
                }
            }
            batch.draw(texture,(int)coordonees.getY(),(int)coordonees.getX());
        } catch (java.lang.IndexOutOfBoundsException e) {
            //
        }
    }


    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public Point getCoordonees() {
        return coordonees;
    }

    public void setCoordonees(Point coordonees) {
        this.coordonees = coordonees;
    }

    public int getLastWayPoint() {
        return lastWayPoint;
    }

    public void setLastWayPoint(int lastWayPoint) {
        this.lastWayPoint = lastWayPoint;
    }

    public int getCurrentLife() {
        return currentLife;
    }

    public void setCurrentLife(int currentLife) {
        this.currentLife = currentLife;
    }

    public ArrayList<Point> getWayPoints() {
        return wayPoints;
    }

    public void setWayPoints(ArrayList<Point> wayPoints) {
        this.wayPoints = wayPoints;
    }

    public int getNbWayPoints() {
        return nbWayPoints;
    }

    public void setNbWayPoints(int nbWayPoints) {
        this.nbWayPoints = nbWayPoints;
    }





}
