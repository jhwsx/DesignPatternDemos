package com.wzc.p28_visitor._6_businessreport_example;

/**
 * 工程师
 *
 * 对应于具体的元素类
 */
public class Engineer extends Staff {
    private int codeLines;

    public Engineer(String name, int kpi, int codeLines) {
        super(name, kpi);
        this.codeLines = codeLines;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines() {
        return codeLines;
    }
}
