package com.towerdefense.game.tower;

/**
 * Created by Yonni on 10/03/2016.
 * the basic tower don't have any specs just shoot ank kill
 */
public class TowerBasic extends Tower{
    public TowerBasic(int damage, int range, int posX, int posY){
        super();
        this.setPosition(new int[]{posX, posY});
        this.setDamage(10);
        this.setRange(10);
    }

}
