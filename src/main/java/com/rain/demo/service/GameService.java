package com.rain.demo.service;

import com.rain.demo.model.ExperienceListener;
import com.rain.demo.model.Leafer;
import com.rain.demo.model.LeaferSingleton;
import com.rain.demo.model.equipment.SkyTrident;
import com.rain.demo.model.equipment.Souller;
import com.rain.demo.model.equipment.SuppressSword;
import com.rain.demo.model.monster.Monster;
import com.rain.demo.model.monster.MonsterFactory;
import com.rain.demo.model.skill.SkillReleaser;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private Leafer hero;
    private Monster monster;

    private ExperienceListener experienceListener;

    private int heroHp;

    // 初始化英雄，小怪
    private void init() {
        hero = LeaferSingleton.getLeafer();
        monster = MonsterFactory.getAer();
        hero.setTarget(monster);
        hero.setSkillReleaser(new SkillReleaser());
        experienceListener = new ExperienceListener();
        experienceListener.judge(0);
    }

    private void fight() {

        while ((heroHp = hero.getHp()) > 0) {
            System.out.println("---------------------------------------------------------");
            int experience = hero.attack();
            experienceListener.judge(experience);

            if (monster.getHp() <= 0) {
                System.out.println(monster.getName() + "阵亡\n本轮英雄获得了胜利");
                break;
            }
            monster.attack();
            hero.getStatus();
        }
        if (heroHp <= 0) {
            System.out.println("英雄阵亡\n本轮怪物获得了胜利");
        }
        System.out.println("掉落装备" + monster.getEquipmentName());
    }

    public void fightAer() {
        init();
        hero.setEquipment(new SuppressSword());
        monster = MonsterFactory.getAer();
        System.out.println("对决：英雄 vs " + monster.getName());
        fight();
    }

    public void fightCai() {
        monster = MonsterFactory.getCai();
        hero.setEquipment(new SkyTrident(hero.getEquipment()));
        System.out.println("对决：英雄 vs " + monster.getName());
        fight();
    }

    public void fightQiong() {
        monster = MonsterFactory.getQiong();
        hero.setEquipment(new Souller(hero.getEquipment()));
        System.out.println("对决：英雄 vs " + monster.getName());
        fight();
    }
}
