package com.wzc.p18_memento._1_original_example;

/**
 * 游戏角色类
 *
 * @author wangzhichao
 * @date 2019/12/02
 */
public class GameRole {
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

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * 状态展示
     */
    public void displayState() {
        System.out.println("角色当前状态：");
        System.out.println("体力：" + vitality);
        System.out.println("攻击力：" + attack);
        System.out.println("防御力：" + defense);
    }

    /**
     * 获得初始状态
     * 数据通常来自本地磁盘或者远程数据库
     */
    public void initState() {
        vitality = 100;
        attack = 100;
        defense = 100;
    }

    /**
     * 战斗
     * 在与 Boss 大战后游戏数据损耗为零
     */
    public void fight() {
        vitality = 0;
        attack = 0;
        defense = 0;
    }
}
