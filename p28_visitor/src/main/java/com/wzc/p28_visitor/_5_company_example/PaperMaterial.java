package com.wzc.p28_visitor._5_company_example;

/**
 * 纸材料
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class PaperMaterial extends Material {
    @Override
    public void accept(Company company) {
        company.create(this);
    }
}
