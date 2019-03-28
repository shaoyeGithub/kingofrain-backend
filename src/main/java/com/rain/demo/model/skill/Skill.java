package com.rain.demo.model.skill;


import com.rain.demo.model.Hero;

public abstract class Skill implements Hero {

    @Override
    public void learnSkill() {
    }

    public abstract void release();
}
