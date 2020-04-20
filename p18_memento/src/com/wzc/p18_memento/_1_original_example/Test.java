package com.wzc.p18_memento._1_original_example;

/**
 * @author wangzhichao
 * @date 2019/12/02
 */
public class Test {
    public static void main(String[] args) {
        // 大战 Boss 前
        System.out.println("大战 Boss 前：");
        GameRole lixiaoyao = new GameRole();
        lixiaoyao.initState();
        lixiaoyao.displayState();
        // 保存进度
        System.out.println("保存进度");
        GameRole backup = new GameRole();
        backup.setVitality(lixiaoyao.getVitality());
        backup.setAttack(lixiaoyao.getAttack());
        backup.setDefense(lixiaoyao.getDefense());
        // 大战 Boss，损耗严重
        System.out.println("大战 Boss，损耗严重：");
        lixiaoyao.fight();
        lixiaoyao.displayState();
        // 决斗效果不理想，恢复之前的状态
        System.out.println("决斗效果不理想，恢复之前的状态");
        lixiaoyao.setVitality(backup.getVitality());
        lixiaoyao.setAttack(backup.getAttack());
        lixiaoyao.setDefense(backup.getDefense());
        lixiaoyao.displayState();
    }
}

/**
 * 总结：
 * 1，这样的写法有什么不足呢？
 * 游戏角色的细节暴露给了客户端，客户端的职责过大，包括获得初始状态，备份，决斗。
 * 假如将来要修改 GameRole，就不得不修改客户端。
 */
