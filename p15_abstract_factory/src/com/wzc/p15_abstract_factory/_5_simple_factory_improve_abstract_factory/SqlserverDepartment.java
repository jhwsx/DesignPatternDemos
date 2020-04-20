package com.wzc.p15_abstract_factory._5_simple_factory_improve_abstract_factory;


/**
 * 用于操作 SQL Server 的 User 表
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public class SqlserverDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 SQL Server 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 SQL Server 中根据 id 得到 Department 表的一条记录");
        return null;
    }
}
