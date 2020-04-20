package com.wzc.p15_abstract_factory._2_factory_example;

/**
 * 定义一个访问 User 表对象的抽象的工厂接口
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public interface IFactory {
    IUser createUser();
}
