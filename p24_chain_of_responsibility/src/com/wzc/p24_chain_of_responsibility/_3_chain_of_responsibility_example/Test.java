package com.wzc.p24_chain_of_responsibility._3_chain_of_responsibility_example;


/**
 * @author wangzhichao
 * @since 2019/12/10
 */
public class Test {
    public static void main(String[] args) {
        Manager commonManager = new CommonManager();
        Manager majordomo = new Majordomo();
        Manager generalManager = new GeneralManager();
        commonManager.setSuccessor(majordomo);
        majordomo.setSuccessor(generalManager);

        Request request = new Request();
        request.setRequestType("加薪");
        request.setRequestContent("小菜请求加薪");
        request.setNumber(1000);
        commonManager.handleRequest(request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("小菜请假");
        request1.setNumber(3);
        commonManager.handleRequest(request1);
    }
}
