package com.wzc.p15_abstract_factory._3_abstract_factory_example;

/**
 * 定义一个访问 User, Department 表对象的抽象的工厂接口
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public interface IFactory {
    IUser createUser();

    IDepartment createDepartment();
}
