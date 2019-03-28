package com.rain.demo.model.equipment;

/**
 * 天堂之戟
 * 每次攻击加一点护甲
 */
public class SkyTrident extends Equipment {
    private String name = "天堂之戟";
    private int defensivenessPlus = 1;
    Equipment equipment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefensivenessPlus() {
        return defensivenessPlus;
    }

    public void setDefensivenessPlus(int defensivenessPlus) {
        this.defensivenessPlus = defensivenessPlus;
    }

    @Override
    public void fire() {
        equipment.fire();
        System.out.println("天堂之戟---");
        leafer.setDefensiveness(leafer.getDefensiveness() + defensivenessPlus);

    }

    public SkyTrident(Equipment equipment) {
        this.equipment = equipment;
    }
}
