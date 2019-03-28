package com.rain.demo.model;

import com.rain.demo.model.equipment.Equipment;
import com.rain.demo.model.equipment.SuppressSword;
import com.rain.demo.model.monster.Monster;
import com.rain.demo.model.skill.Skill;
import com.rain.demo.model.skill.SkillReleaser;

import java.util.Random;

public class Leafer implements Hero {
    private int hp = 100;
    private String name = "虞大叶";
    private int level = 0; //等级
    private int experience = 0;
    private int aggressivity = 12;
    private int defensiveness = 1;
    private Equipment equipment;

    public SkillReleaser getSkillReleaser() {
        return skillReleaser;
    }

    public void setSkillReleaser(SkillReleaser skillReleaser) {
        this.skillReleaser = skillReleaser;
    }

    private SkillReleaser skillReleaser;

    private Skill[] skills;
    private Monster target;

    public Leafer() {
    }


    public int attack() {
        System.out.println("英雄出手>>>");
        skillReleaser.releaseSkill();
        int damage = aggressivity + new Random().nextInt(5);
        target.defense(damage);
        return damage;
    }


    public void defense(int damage) {
        hp -= damage;
        System.out.println("英雄受到伤害 : " + damage);
        System.out.println("当前生命值 : " + hp);
        System.out.println("---------------------");
    }

    @Override
    public void learnSkill() {
        System.out.println("英雄升级。。。\n开始学习技能...");
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAggressivity() {
        return aggressivity;
    }

    public void setAggressivity(int aggressivity) {
        this.aggressivity = aggressivity;
    }

    public int getDefensiveness() {
        return defensiveness;
    }

    public void setDefensiveness(int defensiveness) {
        this.defensiveness = defensiveness;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    public Monster getTarget() {
        return target;
    }

    public void setTarget(Monster target) {
        this.target = target;
    }


    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void experienceIncr(int experience) {
        this.experience += experience;
    }

    public void getStatus() {
        System.out.println("等级: " + level + "\n" +
                "生命值：" + hp + "\n" +
                "攻击力：" + aggressivity + "\n" +
                "护甲：" + defensiveness + "\n" +
                "经验：" + experience + "\n"
        );
    }

}
