package com.wzc.p28_visitor._5_company_example;

/**
 * 造币公司
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class MintCompany extends Company {
    @Override
    public void create(PaperMaterial paperMaterial) {
        System.out.println(this.getClass().getSimpleName() + " 用 " + paperMaterial.getClass().getSimpleName() + " 印纸币。");
    }

    @Override
    public void create(CopperMaterial copperMaterial) {
        System.out.println(this.getClass().getSimpleName() + " 用 " + copperMaterial.getClass().getSimpleName() + " 铸铜币。");
    }
}
