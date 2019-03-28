package com.rain.demo.model.monster;

import com.rain.demo.model.Leafer;
import com.rain.demo.model.LeaferSingleton;

import java.util.Random;

public class Monster {

    private int hp;
    private String name;
    private int aggressivity;
    private String equipmentName;

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    private Leafer leafer = LeaferSingleton.getLeafer();

    public void defense(int damage){
        hp -= damage;
        System.out.println("小怪受到伤害 : " + damage);
        System.out.println("当前生命值 : " + hp);
        System.out.println("---------------------");
    }

    public void attack(){
        int damage = aggressivity + new Random().nextInt(5);
        leafer.defense(damage);
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(int aggressivity) {
        this.aggressivity = aggressivity;
    }

}
