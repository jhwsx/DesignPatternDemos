package com.wzc.p15_abstract_factory._3_abstract_factory_example;

/**
 * 用于客户端访问, 解除与具体数据库访问的耦合
 *
 * @author wangzhichao
 * @date 2019/11/26
 */
public interface IUser {
    void insert(User user);

    User getUser(int id);
}
