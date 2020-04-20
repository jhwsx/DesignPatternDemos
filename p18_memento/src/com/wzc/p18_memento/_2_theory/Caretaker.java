package com.wzc.p18_memento._2_theory;

/**
 * 管理者类
 * <p>
 * 负责保存好备忘录 {@link Memento}，不能对备忘录的内容进行操作或检查。
 * Caretaker 与 Memento 是聚合关系，聚合是一种弱的拥有关系。Memento 明显不是 Caretaker 的一部分。
 * @author wangzhichao
 * @date 2019/12/02
 */
public class Caretaker {
    private Memento memento;

    /**
     * 得到备忘录
     *
     * @return
     */
    public Memento getMemento() {
        return memento;
    }

    /**
     * 设置备忘录
     *
     * @param memento
     */
    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
