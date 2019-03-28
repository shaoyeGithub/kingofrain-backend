package com.rain.demo.model;

import com.rain.demo.model.skill.FirstSkill;
import com.rain.demo.model.skill.SecondSkill;
import com.rain.demo.model.skill.ThirdSkill;

public class ExperienceListener {

    private final int ONE = 50;
    private final int TWO = 150;

    Hero firstSkill, secondSkill, thirdSkill;

    private Leafer leafer;

    public ExperienceListener() {
        this.leafer = LeaferSingleton.getLeafer();
    }


    public void judge(int experience){
        leafer.experienceIncr(experience);
        switch (leafer.getLevel()){
            case 1:{
                if(leafer.getExperience() > this.ONE){
                    leafer.setLevel(2);
                    secondSkill = new SecondSkill();
                    secondSkill.learnSkill();
                    leafer.setExperience(0);
                }
                break;
            }
            case 2:{
                if(leafer.getExperience() > this.TWO){
                    leafer.setLevel(3);
                    thirdSkill = new ThirdSkill();
                    thirdSkill.learnSkill();
                }
                break;
            }
            case 3:{
                break;
            }
            default:{
                leafer.setLevel(1);
                firstSkill = new FirstSkill();
                firstSkill.learnSkill();
            }

        }
    }
}
