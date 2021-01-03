package com.wzc.p15_abstract_factory._3_abstract_factory_example;

/**
 * @author wangzhichao
 * @since 2021/1/3
 */
public class OracleFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new OracleDepartment();
    }
}
