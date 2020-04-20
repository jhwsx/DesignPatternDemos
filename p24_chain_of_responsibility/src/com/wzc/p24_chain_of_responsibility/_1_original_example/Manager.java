package com.wzc.p24_chain_of_responsibility._1_original_example;

/**
 * 管理者，可能是经理，总监，总经理
 *
 * @author wangzhichao
 * @since 2019/12/09
 */
public class Manager {
    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    public void getResult(String managerLevel, Request request) {
        if ("经理".equals(managerLevel)) {
            if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
                System.out.println(name + ":" + request.getRequestContent() + " 数量 " + request.getNumber() + ", 被批准");
            } else {
                System.out.println(name + ":" + request.getRequestContent() + " 数量 " + request.getNumber() + ", 我无权处理");
            }
        } else if ("总监".equals(managerLevel)) {
            if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5) {
                System.out.println(name + ":" + request.getRequestContent() + " 数量 " + request.getNumber() + ", 被批准");
            } else {
                System.out.println(name + ":" + request.getRequestContent() + " 数量 " + request.getNumber() + ", 我无权处理");
            }
        } else if ("总经理".equals(managerLevel)) {
            if ("请假".equals(request.getRequestType())) {
                System.out.println(name + ":" + request.getRequestContent() + " 数量 " + request.getNumber() + ", 被批准");
            } else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500) {
                System.out.println(name + ":" + request.getRequestContent() + " 数量 " + request.getNumber() + ", 被批准");
            } else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500) {
                System.out.println(name + ":" + request.getRequestContent() + " 数量 " + request.getNumber() + ", 以后再说吧");
            }
        }
    }
}
