package com.wzc.p14_observer._4_theoryexample;

/**
 * @author wangzhichao
 * @date 2019/11/03
 */
public class Test {
    public static void main(String[] args) {
        // 具体通知者
        Subject concreteSubject = new ConcreteSubject();

        // 具体观察者
        Observer concreteObserver1 = new ConcreteObserver("x", concreteSubject);
        Observer concreteObserver2 = new ConcreteObserver("y", concreteSubject);

        concreteSubject.attach(concreteObserver1);
        concreteSubject.attach(concreteObserver2);

        concreteSubject.setSubjectState("ABC");
        concreteSubject.notifai();
    }
}
