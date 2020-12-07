package com.wzc.p28_visitor._6_businessreport_example;

public class Manager extends Staff {
    private int productCount;

    public Manager(String name, int kpi, int productCount) {
        super(name, kpi);
        this.productCount = productCount;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProductCount() {
        return productCount;
    }
}
