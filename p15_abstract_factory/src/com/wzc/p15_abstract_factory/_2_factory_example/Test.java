package com.wzc.p15_abstract_factory._2_factory_example;

/**
 * @author wangzhichao
 * @date 2019/11/26
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();

//        IFactory factory = new SqlserverFactory();

        IFactory factory = new AccessFactory();

        IUser su = factory.createUser();

        su.insert(user);

        su.getUser(1);
    }
}

/**
 * 总结:
 * 1, 这个版本使用了工厂方法模式, 通过一行代码就可以切换数据库了.
 * 2, 但是如果有新的表，就要有新的工厂，这个怎么处理呢？
 */