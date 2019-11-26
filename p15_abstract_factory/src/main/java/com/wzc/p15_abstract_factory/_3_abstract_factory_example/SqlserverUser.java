package com.wzc.p15_abstract_factory._3_abstract_factory_example;


/**
 * 用于操作 SQL Server 的 User 表
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public class SqlserverUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("在 SQL Server 中给 User 表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在 SQL Server 中根据 id 得到 User 表的一条记录");
        return null;
    }
}
