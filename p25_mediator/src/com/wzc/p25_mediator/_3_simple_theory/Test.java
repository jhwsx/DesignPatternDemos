package com.wzc.p25_mediator._3_simple_theory;

/**
 * @author wangzhichao
 * @since 2019/12/11
 */
public class Test {
    public static void main(String[] args) {
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1();
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2();
        SimpleMediator.getInstance().register(concreteColleague1);
        SimpleMediator.getInstance().register(concreteColleague2);

        concreteColleague1.send("吃过饭了吗？");
        concreteColleague2.send("没有呢，你打算请客？");
    }
}
