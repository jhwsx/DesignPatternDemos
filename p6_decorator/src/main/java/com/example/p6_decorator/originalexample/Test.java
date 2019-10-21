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

/**
 * 总结：
 * 1，这种写法违反了开放-封闭原则，比如现在要增加超人的打扮，又要去修改 Person 类了。
 * 2，解决办法：把 服饰 与 Person 相分离。
 */
