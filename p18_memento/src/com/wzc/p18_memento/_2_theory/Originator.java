package com.wzc.p18_memento._2_theory;

/**
 * 发起人类
 * <p>
 * 负责创建一个备忘录 {@link Memento}，用以记录当前时刻它的内部状态，并可以使用备忘录恢复内部状态。Originator
 * 可以根据需要决定 {@link Memento} 存储 Originator 的哪些内部状态。
 * Originator 依赖于 Memento，两者之间是依赖关系。
 * @author wangzhichao
 * @date 2019/12/02
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void setMemento(Memento memento) {
        state = memento.getState();
    }

    public void show() {
        System.out.println("state = " + state);
    }
}
