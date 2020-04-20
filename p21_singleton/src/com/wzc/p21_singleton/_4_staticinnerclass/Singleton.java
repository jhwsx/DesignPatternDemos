package com.wzc.p21_singleton._4_staticinnerclass;

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
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static Singleton instance = new Singleton();
    }
}

/**
 * 当外部类Singleton被加载时，其静态内部类SingeletonHolder不会被加载，所以它的成员变量instance是不会被初始化的，
 * 只有当调用Singleton.getInstance()方法时，才会加载SingeletonHolder并且初始化其成员变量，而类加载时是线程安全的，
 * 这样既保证了延迟加载，也保证了线程安全，同时也简化了代码量。
 */
