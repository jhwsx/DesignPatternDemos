package com.wzc.p19_composite._2_composite_example;

/**
 * 公司类
 *
 * @author wangzhichao
 * @date 2019/12/03
 */
public abstract class Company {
    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);

    public abstract void remove(Company company);

    public abstract void display(int depth);

    public abstract void lineofduty();
}
