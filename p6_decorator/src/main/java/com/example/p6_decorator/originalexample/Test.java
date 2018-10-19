package com.example.p6_decorator.originalexample;

/**
 * @author wzc
 * @date 2018/10/18
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("小菜");

        System.out.println("第一种装扮:");

        person.wearTShirts();
        person.wearBigTrousers();
        person.wearSneakers();
        person.show();

        System.out.println("第二种装扮:");

        person.wearSuit();
        person.wearTie();
        person.wearLeatherShoes();
        person.show();
    }
}
