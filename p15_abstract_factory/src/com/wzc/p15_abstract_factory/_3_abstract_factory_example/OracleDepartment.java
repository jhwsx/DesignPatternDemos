package com.wzc.p15_abstract_factory._3_abstract_factory_example;

/**
 * @author wangzhichao
 * @since 2021/1/3
 */
public class OracleDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("在 Oracle 中给 Department 表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在 Oracle 中根据 id 得到 Department 表的一条记录");
        return null;
    }
}
