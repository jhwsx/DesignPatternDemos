package com.example.p6_decorator.v2example;

/**
 * @author wzc
 * @date 2018/10/20
 */
public class Test {
    public static void main(String[] args) {
        Person person = new Person("小菜");
        System.out.println("第一种装扮:");
        Finery tShirts = new TShirts();
        Finery kk = new BigTrousers();
        Finery pqx = new Sneakers();

        tShirts.show();
        kk.show();
        pqx.show();
        person.show();

        System.out.println("第二种装扮:");
        Finery suit = new Suit();
        Finery tie = new Tie();
        Finery ls = new LeatherShoes();

        suit.show();
        tie.show();
        ls.show();
        person.show();
    }
}

/**
 * 总结：
 * 1，虽然实现了人与服饰的分离，但是并不是把人与对应的服饰内部组装好才展示的，这个地方不对。
 */
