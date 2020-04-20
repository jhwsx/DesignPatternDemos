package com.wzc.p15_abstract_factory._2_factory_example;

/**
 * 实现 IFactory 接口, 实例化 AccessUser 对象
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();
    }
}
