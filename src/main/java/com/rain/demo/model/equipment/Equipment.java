package com.rain.demo.model.equipment;

// 使用装饰着模式， 对武器逐步加强

import com.rain.demo.model.Leafer;
import com.rain.demo.model.LeaferSingleton;
import com.rain.demo.model.monster.Monster;
import com.rain.demo.model.monster.MonsterFactory;

/**
 * 压制之刃，天堂之戟 虚灵刀
 */
public abstract class Equipment {
    Leafer leafer = LeaferSingleton.getLeafer();
    Monster monster = MonsterFactory.getCurrentMonster();
    public abstract void fire();
}
