package com.rain.demo.model.skill;

import com.rain.demo.model.Leafer;
import com.rain.demo.model.LeaferSingleton;

public class SecondSkill extends Skill{
    private String name = "虚空之甲";
    /**
     * 魔龙之心 - 回血
     * 虚空之甲 - 护甲永久加成2点
     * 魔王降临 - 连击
     * 魂之挽歌 - 暴怒模式（连击，护甲永久加成2点，回血速度加成）
     */
    private Leafer leafer;

    public SecondSkill() {
        this.leafer = LeaferSingleton.getLeafer();
    }


    @Override
    public void learnSkill() {
        leafer.learnSkill();
        leafer.setHp(leafer.getHp() + 100);
        System.out.println("学习了【虚空之甲】技能");
    }

    @Override
    public void release() {
        System.out.println("施放【虚空之甲】技能");
        leafer.setDefensiveness(leafer.getDefensiveness() + 4);
    }
}
