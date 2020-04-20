package com.example.p13_builder._4_theoryexample;

/**
 * 具体建造者类
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public class ConcreteBuilder2 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件 X");
    }

    @Override
    public void buildPartB() {
        product.add("部件 Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
