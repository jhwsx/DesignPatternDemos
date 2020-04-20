package com.wzc.p15_abstract_factory._6_reflect_plus_abstract_factory;

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
 * 1, 使用反射, 消除了 switch 语句.
 */
