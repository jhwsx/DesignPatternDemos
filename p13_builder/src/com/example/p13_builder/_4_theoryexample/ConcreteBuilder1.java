package com.example.p13_builder._4_theoryexample;

/**
 * 具体建造者类
 *
 * @author wangzhichao
 * @date 2019/11/03
 */
public class ConcreteBuilder1 extends Builder {
    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("部件 A");
    }

    @Override
    public void buildPartB() {
        product.add("部件 B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
