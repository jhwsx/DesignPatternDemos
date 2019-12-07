package com.wzc.p21_singleton._6_reflect_problem;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author wangzhichao
 * @since 2019/12/07
 */
public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        System.out.println(Singleton.getInstance());
        // 下边这样是不行的，因为构造器被私有了
        // Singleton singleton = Singleton.class.newInstance();
        Class<Singleton> singletonClass = Singleton.class;
        Constructor<Singleton> constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton = constructor.newInstance();
        System.out.println(singleton);

        System.out.println(SingletonFix.getInstance());
        Class<SingletonFix> singletonFixClass = SingletonFix.class;
        Constructor<SingletonFix> singletonFixConstructor = singletonFixClass.getDeclaredConstructor();
        singletonFixConstructor.setAccessible(true);
        SingletonFix singletonFix = singletonFixConstructor.newInstance();
        System.out.println(singletonFix);
    }
}
