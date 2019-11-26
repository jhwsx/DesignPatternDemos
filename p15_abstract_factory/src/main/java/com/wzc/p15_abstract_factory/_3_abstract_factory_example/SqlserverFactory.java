package com.wzc.p15_abstract_factory._3_abstract_factory_example;

/**
 * 实现 IFactory 接口, 实例化 SqlserverUser, SqlserverDepartment 对象
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public class SqlserverFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlserverUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlserverDepartment();
    }
}
