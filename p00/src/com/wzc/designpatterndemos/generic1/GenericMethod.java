package com.wzc.designpatterndemos.generic1;

/**
 * @author wzc
 * @date 2018/5/5
 */
public class GenericMethod {

    public static <T> void staticMethod(T a) {
        System.out.println("staticMethod: a = " + a);
    }

    public <T> void nonstaticMethod(T a) {
        System.out.println("nonstaticMethod: a = " + a);
    }

    public static <T> T[] fun(T...arg) {
        return arg;
    }

    public static <T> String getClassName(Class<T> clazz) {
        return clazz.getName();
    }
}
