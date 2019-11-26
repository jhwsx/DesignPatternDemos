package com.wzc.p15_abstract_factory._1_original_example;

/**
 * 用于操作 User 表
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public class SqlserverUser {
    public void insert(User user) {
        System.out.println("在 SQL Server 中给 User 表增加一条记录");
    }

    public User getUser(int id) {
        System.out.println("在 SQL Server 中根据 id 得到 User 表的一条记录");
        return null;
    }
}
