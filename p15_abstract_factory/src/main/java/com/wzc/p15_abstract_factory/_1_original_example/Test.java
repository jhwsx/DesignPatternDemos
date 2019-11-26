package com.wzc.p15_abstract_factory._1_original_example;

/**
 * @author wangzhichao
 * @date 2019/11/26
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();

        SqlserverUser su = new SqlserverUser();

        su.insert(user);

        su.getUser(1);
    }
}

/**
 * 总结:
 * 1, 这个例子的缺点在哪里?
 * su 这个对象被框死在 SQL Server 上, 也就是说 su 不能再指向其他数据库了,比如 Access.
 * 2, 解决办法:
 * 使用工厂方法模式定义一个创建对象的接口,让子类来决定实例化哪一个类.
 */
