package com.wzc.p20_iterator._1_theory;

/**
 * @author wangzhichao
 * @date 2019/12/04
 */
public class Test {
    public static void main(String[] args) {
        ConcreteAggregate<String> a = new ConcreteAggregate<>();
        a.add("大鸟");
        a.add("小菜");
        a.add("行李");
        a.add("老外");
        a.add("公交内部员工");
        a.add("小偷");

        Iterator<String> iterator = a.createIterator();
        while (!iterator.isDone()) {
            System.out.println(iterator.currentItem());
            iterator.next();
        }
    }
}