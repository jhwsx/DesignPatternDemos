package com.wzc.p15_abstract_factory._3_abstract_factory_example;

/**
 * @author wangzhichao
 * @since 2021/1/3
 */
public class OracleUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在 Oracle 中给 User 表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 Oracle 中根据 id 得到 User 表的一条记录");
        return null;
    }
}
