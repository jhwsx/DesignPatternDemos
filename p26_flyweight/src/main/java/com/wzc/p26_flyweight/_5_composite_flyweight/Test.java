package com.wzc.p26_flyweight._5_composite_flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangzhichao
 * @since 2019/12/13
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> compositeState = new ArrayList<>();
        compositeState.add(2);
        compositeState.add(0);
        compositeState.add(4);
        compositeState.add(8);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight compositeFlyweight1 = flyweightFactory.factory(compositeState);
        Flyweight compositeFlyweight2 = flyweightFactory.factory(compositeState);

        System.out.println("复合享元对象是否共享：" + (compositeFlyweight1 == compositeFlyweight2));

    }
}
