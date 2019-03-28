package com.rain.demo.model.equipment;

/**
 * 压制之刃
 * 纯加攻击
 */
public class SuppressSword extends Equipment {

    private String name = "压制之刃";
    private int aggreesivityPlus = 15;
    @Override
    public void fire() {
        System.out.println("压制之刃效果---");
        monster.defense(aggreesivityPlus);
    }
}
