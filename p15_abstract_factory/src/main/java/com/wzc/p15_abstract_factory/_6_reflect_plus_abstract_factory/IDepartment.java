package com.wzc.p15_abstract_factory._6_reflect_plus_abstract_factory;


/**
 * 用于客户端访问, 解除与具体数据库访问的耦合
 * 抽象产品, 对这个抽象产品可以有不同的具体实现: SqlserverDepartment, AccessDepartment
 * @author wangzhichao
 * @date 2019/11/26
 */
public interface IDepartment {

    void insert(Department department);

    Department getDepartment(int id);
}
