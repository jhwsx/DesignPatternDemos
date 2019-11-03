package com.example.p13_builder._4_theoryexample;

/**
 * @author wangzhichao
 * @date 2019/11/03
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director();

        Builder builder1 = new ConcreteBuilder1();
        director.construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();

        Builder builder2 = new ConcreteBuilder2();
        director.construct(builder2);
        Product product2 = builder2.getResult();
        product2.show();
    }
}
