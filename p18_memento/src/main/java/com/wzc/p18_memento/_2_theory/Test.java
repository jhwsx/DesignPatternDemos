package com.wzc.p18_memento._2_theory;

/**
 * @author wangzhichao
 * @date 2019/12/02
 */
public class Test {
    public static void main(String[] args) {
        // 初始化发起人
        Originator originator = new Originator();
        // 设置初始状态为 “On”
        originator.setState("On");

        // 保存状态时，由于有很好的封装，可以隐藏 Originator 的实现细节
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        // 改变状态
        originator.setState("Off");
        originator.show();

        // 恢复状态
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
