package com.wzc.p15_abstract_factory._3_abstract_factory_example;

/**
 * 用于操作 Access 的 Department 表
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 Access 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 Access 中根据 id 得到 Department 表的一条记录");
        return null;
    }
}
