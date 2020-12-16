package com.wzc.p28_visitor._6_businessreport_example;
/**
 * 项目经理
 *
 * 对应于具体的元素类
 */
public class Manager extends Staff {
    private int productCount;
    private double income;
    public Manager(String name, int kpi, int productCount, double income) {
        super(name, kpi);
        this.productCount = productCount;
        this.income = income;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProductCount() {
        return productCount;
    }

    public double getIncome() {
        return income;
    }
}
