package com.wzc.p14_observer._4_theoryexample;

/**
 * 具体观察者
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public class ConcreteObserver extends Observer {
    private String name;
    private Subject subject;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("观察者 " + name + " 的新状态是：" + subject.getSubjectState());
    }
}
