package com.wzc.p16_state.veryexample;


/**
 * 晚间工作状态
 *
 * @author wzc
 * @date 2018/9/20
 */
public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间: " + work.getHour() + " 点, 加班哦,疲惫至极");
            } else {
                work.setState(new SleepingState());
            }
        }
    }
}
