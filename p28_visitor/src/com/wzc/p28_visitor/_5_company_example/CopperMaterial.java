package com.wzc.p28_visitor._5_company_example;

/**
 * 铜材料
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class CopperMaterial extends Material {
    @Override
    public void accept(Company company) {
        company.create(this);
    }
}
