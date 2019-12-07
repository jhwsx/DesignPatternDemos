package com.wzc.p21_singleton._2_lazy;

/**
 * 懒汉式
 *
 * @author wangzhichao
 * @since 2019/12/06
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        //no instance
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
