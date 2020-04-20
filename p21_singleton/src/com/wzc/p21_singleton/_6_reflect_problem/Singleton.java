package com.wzc.p21_singleton._6_reflect_problem;

import java.io.Serializable;

/**
 * 静态内部类实现的单例模式
 *
 * @author wangzhichao
 * @since 2019/12/07
 */
public class Singleton implements Serializable {
    private Singleton() {
        //no instance
        System.out.println("Singleton constructor");
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }

    private Object readResolve() {
        return SingletonHolder.instance;
    }
}

