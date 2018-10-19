package com.example.p6_decorator.v3example;

/**
 * @author wzc
 * @date 2018/10/20
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("小菜");
        TShirts tShirts = new TShirts();
        tShirts.setPerson(person);

        BigTrousers bigTrousers = new BigTrousers();
        bigTrousers.setPerson(tShirts);

        Sneakers sneakers = new Sneakers();
        sneakers.setPerson(bigTrousers);

        sneakers.show();
    }
}
