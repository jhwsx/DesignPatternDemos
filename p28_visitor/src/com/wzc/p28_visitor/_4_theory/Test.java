package com.wzc.p28_visitor._4_theory;

/**
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new ConcreteElementA());
        objectStructure.attach(new ConcreteElementB());

        objectStructure.accept(new ConcreteVisitorA());

        objectStructure.accept(new ConcreteVisitorB());
    }
}
