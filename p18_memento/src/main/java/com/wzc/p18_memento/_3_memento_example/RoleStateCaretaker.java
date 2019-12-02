package com.wzc.p18_memento._3_memento_example;

/**
 * 游戏角色状态管理类
 *
 * @author wangzhichao
 * @date 2019/12/02
 */
public class RoleStateCaretaker {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
