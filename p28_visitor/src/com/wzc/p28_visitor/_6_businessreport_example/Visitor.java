package com.wzc.p28_visitor._6_businessreport_example;
/**
 * 访问者
 */
public interface Visitor {
    void visit(Engineer engineer);

    void visit(Manager manager);
}
