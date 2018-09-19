package com.wzc.p16_state.veryexample;


/**
 * 中午工作状态
 *
 * @author wzc
 * @date 2018/9/20
 */
public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间: " + work.getHour() + " 点 饿了, 午饭, 饭后午休.");
        } else {
            work.setState(new AfternoonState());
            work.writeProgram();
        }

    }
}
