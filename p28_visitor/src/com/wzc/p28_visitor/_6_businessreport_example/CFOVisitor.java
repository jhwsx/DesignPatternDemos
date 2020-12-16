package com.wzc.p28_visitor._6_businessreport_example;

public class CFOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.getName() + ", kpi: " + engineer.getKpi());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("项目经理：" + manager.getName() + ", kpi: " + manager.getKpi() + ", income: " + manager.getIncome() + "元。");
    }
}
