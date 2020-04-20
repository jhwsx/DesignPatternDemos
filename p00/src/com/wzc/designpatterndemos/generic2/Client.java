package com.wzc.designpatterndemos.generic2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 来自启舰的博客
 * https://blog.csdn.net/harvic880925/article/details/49883589
 * @author wzc
 * @date 2018/5/5
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("类型绑定：");

        StringCompare stringCompare = min(new StringCompare("abc"), new StringCompare("abcd"), new StringCompare("a"));
        System.out.println(stringCompare.getString());

        System.out.println(getFruitName(new Apple()));
        System.out.println(getFruitName(new Banana()));

        System.out.println("通配符：");

        Point<Integer> integerPoint = new Point<>(3, 3);
        Point<Float> floatPoint = new Point<>(1.1f, 1.1f);
        Point<Double> doublePoint = new Point<>(1.2, 1.3);
        Point<Long> longPoint = new Point<>(12345L, 12345L);
        System.out.println("    无边界通配符：?");
        Point<?> point;
        point = new Point<Integer>(3, 3);
        point = new Point<Float>(1.1f, 1.1f);
        point = new Point<Double>(1.2, 1.3);
        point = new Point<Long>(12345L, 12345L);
        point = new Point<String>();
        point = new Point<Object>();

        System.out.println("通配符？的extends绑定:");
        Point<? extends Number> point1;
        point1 = new Point<Number>();
        point1 = new Point<Integer>(3, 3);
        Number x = point1.getX();
//        point1.setX(new Integer(4)); // 编译错误
        point1 = new Point<Float>(1.1f, 1.1f);
        point1 = new Point<Double>(1.2, 1.3);
        point1 = new Point<Long>(12345L, 12345L);
//        point1 = new Point<String>(); // 编译报错
//        point1 = new Point<Object>(); // 编译报错

        System.out.println("通配符？的super绑定:");
        List<? super Manager> list;

        list = new ArrayList<Employee>();

//        list.add(new Employee()); // 编译错误
        list.add(new Manager());
        list.add(new CEO());

        Object object = list.get(0);
//        Manager manager = list.get(0); // 编译错误
        list = new ArrayList<Manager>();
//        list = new ArrayList<CEO>(); // 编译报错

    }

    public static <T extends Comparable> T min(T... a) {
        T smallest = a[0];
        for (T item : a) {
            if (smallest.compareTo(item)) {
                smallest = item;
            }
        }
        return smallest;
    }

    public static <T extends Fruit & Serializable> String getFruitName(T t) {
        return t.getName();
    }
}
