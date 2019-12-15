package com.wzc.p28_visitor._5_company_example;

/**
 * 公司类
 * <p>
 * 对应于 Visitor
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public abstract class Company {

    public abstract void create(PaperMaterial paperMaterial);

    public abstract void create(CopperMaterial copperMaterial);

}
