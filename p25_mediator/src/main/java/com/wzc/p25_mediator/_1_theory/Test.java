package com.wzc.p25_mediator._1_theory;

/**
 * @author wangzhichao
 * @since 2019/12/11
 */
public class Test {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(mediator);

        mediator.register(concreteColleague1);
        mediator.register(concreteColleague2);

        concreteColleague1.send("吃过饭了吗？");
        concreteColleague2.send("没有呢，你打算请客？");
    }
}
