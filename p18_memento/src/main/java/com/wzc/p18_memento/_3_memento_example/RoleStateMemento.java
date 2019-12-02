package com.wzc.p18_memento._3_memento_example;

/**
 * 游戏角色状态存储箱
 *
 * @author wangzhichao
 * @date 2019/12/02
 */
public class RoleStateMemento {
    /**
     * 生命力
     */
    private int vitality;
    /**
     * 攻击力
     */
    private int attack;
    /**
     * 防御力
     */
    private int defense;

    public RoleStateMemento(int vitality, int attack, int defense) {
        this.vitality = vitality;
        this.attack = attack;
        this.defense = defense;
    }

    public int getVitality() {
        return vitality;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }
}
