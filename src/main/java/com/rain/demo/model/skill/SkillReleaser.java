package com.rain.demo.model.skill;

import com.rain.demo.model.Leafer;
import com.rain.demo.model.LeaferSingleton;

import java.util.Scanner;

public class SkillReleaser {
    private Skill skill;
    private Leafer leafer = LeaferSingleton.getLeafer();

    public void releaseSkill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择回合施放技能:");
        int level = leafer.getLevel();
        switch (level) {
            case 1: {
                System.out.println("本轮可施放技能：1.魔龙之心【回血】");
                break;
            }
            case 2: {
                System.out.println("本轮可施放技能：1.魔龙之心【回血】、2.虚空之甲【护甲永久加成4点】");
                break;
            }
            case 3: {
                System.out.println("本轮可施放技能：1.魔龙之心【回血】、2.虚空之甲【护甲永久加成4点】、3.魔王降临【连击】");
                break;
            }
        }
        int i = scanner.nextInt();
        chooseSkill(i);
        skill.release();
    }

    private void chooseSkill(int i) {
        switch (i) {
            case 1:
                skill = new FirstSkill();
                break;
            case 2:
                skill = new SecondSkill();
                break;
            case 3:
                skill = new ThirdSkill();
                break;
        }
    }
}
