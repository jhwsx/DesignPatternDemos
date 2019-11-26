package com.wzc.p15_abstract_factory._5_simple_factory_improve_abstract_factory;

/**
 * @author wangzhichao
 * @date 2019/11/26
 */
public class Test {
    public static void main(String[] args) {
        IUser user = DataAccess.createUser();

        user.insert(new User());

        user.getUser(1);

        IDepartment department = DataAccess.createDepartment();

        department.insert(new Department());

        department.getDepartment(1);
    }
}

/**
 * 总结:
 * 1, 使用简单工厂模式来改进抽象工厂模式:
 * 这样即便新增加了表, 也只需要修改 DataAccess 类就够了; 相比之前的抽象工厂模式, 却需要修改 IFactory,AccessFactory,SqlserverFactory三个类
 */
