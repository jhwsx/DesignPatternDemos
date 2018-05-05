package com.wzc.designpatterndemos.generic1;

import java.util.Arrays;

/**
 * https://blog.csdn.net/harvic880925/article/details/49872903
 * @author wzc
 * @date 2018/5/5
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("不使用泛型：");
        ObjectPoint integerPoint = new ObjectPoint();
        integerPoint.setX(new Integer(100));
        Integer integer = (Integer) integerPoint.getX();
        System.out.println(integer);

        ObjectPoint floatPoint = new ObjectPoint();
        floatPoint.setX(new Float(100.12f));
        Float floatX = (Float) floatPoint.getX();
//        String floatX = (String) floatPoint.getX();
        System.out.println(floatX);
        System.out.println("使用泛型：");
        Point<Integer> integerPoint1 = new Point<>();
        integerPoint1.setX(new Integer(100));
        Integer x = integerPoint1.getX();
        System.out.println(x);

        Point<Float> floatPoint1 = new Point<>();
        floatPoint1.setX(new Float(100.12f));
        Float x1 = floatPoint1.getX();
        System.out.println(x1);

        System.out.println("多泛型变量：");
        MorePoint<Integer, String> integerStringMorePoint = new MorePoint<>();
        integerStringMorePoint.setName("wzc");
        System.out.println(integerStringMorePoint.getName());

        System.out.println("泛型接口之非泛型类使用：");
        InfoImpl info = new InfoImpl();
        info.setVar("wzc");
        System.out.println(info.getVar());

        System.out.println("泛型接口之泛型类使用：");
        InfoImpl2<String> stringInfoImpl2 = new InfoImpl2<>();
        stringInfoImpl2.setVar("wzc");
        System.out.println(stringInfoImpl2.getVar());

        InfoImpl3<Integer, Float, String> integerFloatStringInfoImpl3 = new InfoImpl3<>();
        integerFloatStringInfoImpl3.setVar("wzc3");
        System.out.println(integerFloatStringInfoImpl3.getVar());

        System.out.println("泛型函数：");

        GenericMethod.staticMethod("wzc");
        GenericMethod.<String>staticMethod("wzc");

        GenericMethod genericMethod = new GenericMethod();
        genericMethod.nonstaticMethod("wzc");
        genericMethod.<Integer>nonstaticMethod(1);

        System.out.println("Class<T>类传递及泛型数组:");

        String className = GenericMethod.getClassName(GenericMethod.class);
        System.out.println(className);

        Integer[] fun = GenericMethod.fun(1, 2, 3, 4, 5, 6);
        System.out.println(Arrays.toString(fun));
    }
}
