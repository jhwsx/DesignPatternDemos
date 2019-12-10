package com.wzc.p24_chain_of_responsibility._1_original_example;

/**
 * @author wangzhichao
 * @since 2019/12/09
 */
public class Test {
    public static void main(String[] args) {
        Manager jinli = new Manager("金利");
        Manager zongjian = new Manager("宗剑");
        Manager zhongjingli = new Manager("钟精励");

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumber(1000);

        jinli.getResult("经理", request);
        zongjian.getResult("总监", request);
        zhongjingli.getResult("总经理", request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("小菜请假");
        request1.setNumber(3);

        jinli.getResult("经理", request1);
        zongjian.getResult("总监", request1);
        zhongjingli.getResult("总经理", request1);
    }
}

/**
 * 总结：
 * 1，Manager 类有太多的职责，违背了单一职责原则；
 * 2，将来可能会修改 Manager 类，比如增加人力资源管理者，总裁等，违背了开放封闭原则。
 */