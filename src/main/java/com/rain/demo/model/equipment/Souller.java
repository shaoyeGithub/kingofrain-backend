package com.rain.demo.model.equipment;

/**
 * 虚灵刀
 * 吸血：每轮攻击回复造成伤害的50%
 */
public class Souller extends Equipment {

    private Equipment equipment;
    private String name = "虚灵刀";
    private int bloodsucking;

    public Souller(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public void fire() {
        equipment.fire();
        System.out.println("虚灵刀----");
        leafer.setHp(leafer.getAggressivity()/2);
    }
}
