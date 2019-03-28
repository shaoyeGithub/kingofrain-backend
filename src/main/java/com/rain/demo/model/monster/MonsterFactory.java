package com.rain.demo.model.monster;

public class MonsterFactory {
    private final static int HP_AER = 80;
    private final static int HP_CAI = 140;
    private final static int HP_QIONG = 220;

    private final static String NAME_AER = "小雨";
    private final static String NAME_CAI = "大雨";
    private final static String NAME_QIONG = "暴雨";

    private final static int AGGRESSIVITY_AER = 11;
    private final static int AGGRESSIVITY_CAI = 15;
    private final static int AGGRESSIVITY_QIONG = 20;

    private final static String EQUIPMEMT_AER = "天堂之戟";
    private final static String EQUIPMEMT_CAI = "虚灵刀";
    private final static String EQUIPMEMT_QIONG = "人命币10000000000000000000000000000元";

    private static Monster monster;
    public static Monster getAer(){
        if(monster == null){
            monster = new Monster();
        }
        monster.setName(NAME_AER);
        monster.setHp(HP_AER);
        monster.setAggressivity(AGGRESSIVITY_AER);
        monster.setEquipmentName(EQUIPMEMT_AER);
        return monster;
    }

    public static Monster getCai(){
        if(monster == null){
            monster = new Monster();
        }
        monster.setName(NAME_CAI);
        monster.setHp(HP_CAI);
        monster.setAggressivity(AGGRESSIVITY_CAI);
        monster.setEquipmentName(EQUIPMEMT_CAI);
        return monster;
    }
    public static Monster getQiong(){
        if(monster == null){
            monster = new Monster();
        }
        monster.setName(NAME_QIONG);
        monster.setHp(HP_QIONG);
        monster.setAggressivity(AGGRESSIVITY_QIONG);
        monster.setEquipmentName(EQUIPMEMT_QIONG);
        return monster;
    }

    public static Monster getCurrentMonster(){
        return monster;
    }
}
