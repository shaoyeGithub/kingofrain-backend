package com.rain.demo.model.skill;

import com.rain.demo.model.Hero;
import com.rain.demo.model.Leafer;
import com.rain.demo.model.LeaferSingleton;

import java.util.Random;

public class FirstSkill  extends Skill{
    private String name = "魔龙之心";
    /**
     * 魔龙之心 - 回血
     * 虚空之甲 - 护甲永久加成2点
     * 魔王降临 - 连击
     * 魂之挽歌 - 暴怒模式（连击，护甲永久加成2点，回血速度加成）
     */
    private Leafer leafer;

    public FirstSkill() {
        this.leafer = LeaferSingleton.getLeafer();
    }

    @Override
    public void release() {
        System.out.println("施放【魔龙之心】技能");
        leafer.setHp(leafer.getHp()+(int)(Math.random()*10));
    }

    @Override
    public void learnSkill() {
        leafer.learnSkill();
        System.out.println("学习了【魔龙之心】技能");
    }
}
