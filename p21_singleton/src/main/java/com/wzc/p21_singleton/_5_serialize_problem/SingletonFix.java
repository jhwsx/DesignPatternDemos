package com.wzc.p21_singleton._5_serialize_problem;

import java.io.Serializable;

/**
 * 静态内部类实现的单例模式
 *
 * @author wangzhichao
 * @since 2019/12/07
 */
public class SingletonFix implements Serializable {
    private SingletonFix() {
        //no instance
    }

    public static SingletonFix getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static SingletonFix instance = new SingletonFix();
    }

    private Object readResolve() {
        return SingletonHolder.instance;
    }
}

