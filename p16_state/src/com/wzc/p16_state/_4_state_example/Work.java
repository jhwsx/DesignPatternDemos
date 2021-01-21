package com.wzc.p16_state._4_state_example;

/**
 * 对应于 Context 类，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换。
 * @author wzc
 * @date 2018/9/20
 */
public class Work {
    /**
     * 钟点属性,状态转换的依据
     */
    private int hour;
    /**
     * 任务完成属性,是否能下班的依据
     */
    private boolean finish = false;
    /**
     * 当前状态的变量
     */
    private State currentState;

    public Work() {
        // 工作初始化为上午工作状态,即上午 9 点开始上班.
        currentState = new ForenoonState();
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void writeProgram() {
        currentState.writeProgram(this);
    }

    /**
     * 切换状态
     */
    public void setState(State state) {
        currentState = state;
    }
}
