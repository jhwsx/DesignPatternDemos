package com.wzc.p18_memento._3_memento_example;

/**
 * @author wangzhichao
 * @date 2019/12/02
 */
public class Test {
    public static void main(String[] args) {
        // 大战 Boss 前
        System.out.println("大战 Boss 前：");
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.displayState();
        // 保存状态
        System.out.println("保存状态：");
        RoleStateMemento memento = gameRole.createMemento();
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(memento);

        // 大战 Boss，损耗严重
        System.out.println("大战 Boss，损耗严重:");
        gameRole.fight();
        gameRole.displayState();

        // 决斗效果不理想，恢复之前的状态
        System.out.println("决斗效果不理想，恢复之前的状态");
        gameRole.setMemento(roleStateCaretaker.getMemento());
        gameRole.displayState();
    }
}
