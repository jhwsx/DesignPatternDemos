package com.wzc.p28_visitor._6_businessreport_example;

/**
 * 员工抽象类
 *
 * 对应于 Element
 */
public abstract class Staff {
    private String name;
    private int kpi;

    public Staff(String name, int kpi) {
        this.name = name;
        this.kpi = kpi;
    }

    public String getName() {
        return name;
    }

    public int getKpi() {
        return kpi;
    }

    public abstract void accept(Visitor visitor);
}
