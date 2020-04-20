package com.wzc.p19_composite._2_composite_example;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司类，枝节点
 *
 * @author wangzhichao
 * @date 2019/12/03
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
        for (Company company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void lineofduty() {
        for (Company company : children) {
            company.lineofduty();
        }
    }
}
