package com.example.p6_decorator.v3example;

/**
 * @author wzc
 * @date 2018/10/20
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("小菜");
        TShirts tShirts = new TShirts();
        BigTrousers bigTrousers = new BigTrousers();
        Sneakers sneakers = new Sneakers();

        tShirts.decorate(person);
        bigTrousers.decorate(tShirts);
        sneakers.decorate(bigTrousers);


        sneakers.show();
    }
}
