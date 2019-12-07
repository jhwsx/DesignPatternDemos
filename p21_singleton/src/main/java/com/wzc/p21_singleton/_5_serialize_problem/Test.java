package com.wzc.p21_singleton._5_serialize_problem;


import com.wzc.p21_singleton._4_staticinnerclass.Singleton;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author wangzhichao
 * @since 2019/12/07
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance);
        System.out.println(createNewInstance(instance));
        SingletonFix singletonFix = SingletonFix.getInstance();
        System.out.println(singletonFix);
        System.out.println(createNewInstance(singletonFix));

    }

    private static Singleton createNewInstance(Singleton singleton) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(singleton);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (Singleton) ois.readObject();
    }

    private static SingletonFix createNewInstance(SingletonFix singleton) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(singleton);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (SingletonFix) ois.readObject();
    }

}

/*
 com.wzc.p21_singleton._4_staticinnerclass.Singleton@42a57993
 com.wzc.p21_singleton._4_staticinnerclass.Singleton@1b6d3586
 com.wzc.p21_singleton._5_serialize_problem.Singleton@4554617c
 com.wzc.p21_singleton._5_serialize_problem.Singleton@4554617c
 */

/**
 * 总结：
 * 1，不添加 readResolve 方法，通过反序列化仍然可以有多个实例。
 */


