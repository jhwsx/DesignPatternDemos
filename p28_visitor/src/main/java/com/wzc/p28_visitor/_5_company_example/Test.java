package com.wzc.p28_visitor._5_company_example;

/**
 * 艺术公司利用“铜”可以设计出铜像，利用“纸”可以画出图画；造币公司利用“铜”可以印出铜币，利用“纸”可以印出纸币。
 * 对“铜”和“纸”这两种元素，两个公司的处理方法不同，所以该实例用访问者模式来实现比较适合。
 *
 * @author wangzhichao
 * @since 2019/12/15
 */
public class Test {
    public static void main(String[] args) {
        SetMaterial setMaterial = new SetMaterial();
        setMaterial.add(new CopperMaterial());
        setMaterial.add(new PaperMaterial());

        setMaterial.accept(new ArtCompany());

        setMaterial.accept(new MintCompany());
    }
}
