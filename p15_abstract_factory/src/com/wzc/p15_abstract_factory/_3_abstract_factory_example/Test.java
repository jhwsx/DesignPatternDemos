package com.wzc.p15_abstract_factory._3_abstract_factory_example;

/**
 * @author wangzhichao
 * @date 2019/11/26
 */
public class Test {
    public static void main(String[] args) {
        User user = new User();

        IFactory factory = new SqlserverFactory();

//        IFactory factory = new AccessFactory();

        IUser su = factory.createUser();

        su.insert(user);

        su.getUser(1);

        IDepartment department = factory.createDepartment();

        department.insert(new Department());

        department.getDepartment(1);
    }
}

/**
 * 总结:
 * 1, 抽象工厂模式:可以方便地切换工厂,管理一组产品.
 */