package com.wzc.p19_composite._2_composite_example;

/**
 * 人力资源部，叶节点
 *
 * @author wangzhichao
 * @date 2019/12/03
 */
public class HRDepartment extends Company {
    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("-");
        }
        sb.append(name);
        System.out.println(sb);
    }

    @Override
    public void lineofduty() {
        System.out.println(name + " 员工招聘培训管理");
    }
}
