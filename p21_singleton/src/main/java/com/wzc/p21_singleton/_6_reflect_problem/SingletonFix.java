package com.wzc.p21_singleton._6_reflect_problem;

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
        //Prevent form the reflection api.
        if (!getInstanceInvoked){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        System.out.println("SingletonFix constructor");
        getInstanceInvoked = false;
    }

    private static boolean getInstanceInvoked = false;
    public static SingletonFix getInstance() {
        getInstanceInvoked = true;
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static SingletonFix instance = new SingletonFix();
    }

    private Object readResolve() {
        return SingletonHolder.instance;
    }
}

