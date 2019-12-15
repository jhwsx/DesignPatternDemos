package com.wzc.p28_visitor._3_visitor_example;

/**
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Test {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        Success success = new Success();
        objectStructure.display(success);

        Failure failure = new Failure();
        objectStructure.display(failure);

        Love love = new Love();
        objectStructure.display(love);

        Marriage marriage = new Marriage();
        objectStructure.display(marriage);
    }
}
