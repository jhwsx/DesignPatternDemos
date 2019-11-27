package com.wzc.p16_state._4_state_example;


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
            // 若任务完成, 则转入下班状态
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间: " + work.getHour() + " 点, 加班哦,疲惫至极");
            } else {
                // 超过 21 点, 则转入睡眠工作状态
                work.setState(new SleepingState());
            }
        }
    }
}
