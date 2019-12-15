package com.wzc.p28_visitor._5_company_example;

/**
 * 材料类
 * <p>
 * 对应于 Element
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public abstract class Material {
    /**
     * 接受访问者
     *
     * @param company
     */
    public abstract void accept(Company company);
}
