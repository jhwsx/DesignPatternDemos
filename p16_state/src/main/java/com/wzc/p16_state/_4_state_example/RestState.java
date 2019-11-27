package com.wzc.p16_state._4_state_example;

/**
 * 下班休息状态
 *
 * @author wzc
 * @date 2018/9/20
 */
public class RestState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间: " + work.getHour() + " 点, 下班回家了");
    }
}
