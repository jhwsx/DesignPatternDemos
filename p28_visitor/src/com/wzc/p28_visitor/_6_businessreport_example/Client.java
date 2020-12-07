package com.wzc.p28_visitor._6_businessreport_example;

public class Client {
    public static void main(String[] args) {
        // 工程师
        Engineer peter = new Engineer("peter", 10, 10000);
        Engineer john = new Engineer("john", 9, 15000);
        Engineer david = new Engineer("david", 6, 5000);
        // 项目经理
        Manager lucy = new Manager("lucy", 10, 1);
        Manager lily = new Manager("lily", 7, 3);
        // 登记员工信息，供领导查看报表
        BusinessReport businessReport = new BusinessReport();
        businessReport.attach(peter);
        businessReport.attach(john);
        businessReport.attach(david);
        businessReport.attach(lucy);
        businessReport.attach(lily);

        // CEO
        System.out.println("CEO 查看业务报表：");
        CEOVisitor ceo = new CEOVisitor();
        businessReport.displayReport(ceo);
        // CTO
        System.out.println("CTO 查看业务报表：");
        CTOVisitor cto = new CTOVisitor();
        businessReport.displayReport(cto);
    }
}
