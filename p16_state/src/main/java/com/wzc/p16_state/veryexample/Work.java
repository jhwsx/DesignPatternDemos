package com.wzc.p16_state.veryexample;

/**
 * @author wzc
 * @date 2018/9/20
 */
public class Work {
    /**
     * 钟点属性,状态转换的依据
     */
    private int hour;
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

    /**
     * 任务完成属性,是否能下班的依据
     */
    private boolean finish = false;

    public void writeProgram() {
        currentState.writeProgram(this);
    }

    public void setState(State state) {
        currentState = state;
    }
}