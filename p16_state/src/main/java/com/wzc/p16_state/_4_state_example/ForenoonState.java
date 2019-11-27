package com.wzc.p16_state._4_state_example;


/**
 * 上午工作状态
 *
 * @author wzc
 * @date 2018/9/20
 */
public class ForenoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间: " + work.getHour() + " 点 上午工作,精神百倍.");
        } else {
            // 超过 12 点, 则转入中午工作状态
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
