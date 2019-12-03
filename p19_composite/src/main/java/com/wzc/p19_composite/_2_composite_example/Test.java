package com.wzc.p19_composite._2_composite_example;

/**
 * @author wangzhichao
 * @date 2019/12/03
 */
public class Test {
    public static void main(String[] args) {
        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company = new ConcreteCompany("上海华东分公司");
        company.add(new HRDepartment("上海华东分公司人力资源部"));
        company.add(new FinanceDepartment("上海华东分公司财务部"));
        root.add(company);

        ConcreteCompany company1 = new ConcreteCompany("南京办事处");
        company1.add(new HRDepartment("南京办事处人力资源部"));
        company1.add(new FinanceDepartment("南京办事处财务部"));
        root.add(company1);

        ConcreteCompany company2 = new ConcreteCompany("杭州办事处");
        company2.add(new HRDepartment("杭州办事处人力资源部"));
        company2.add(new FinanceDepartment("杭州办事处财务部"));
        root.add(company2);

        root.display(1);

        root.lineofduty();

    }
}
