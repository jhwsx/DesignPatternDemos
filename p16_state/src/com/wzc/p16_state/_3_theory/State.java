package com.wzc.p16_state._3_theory;

/**
 * 抽象状态类,定义一个接口以封装与Context的一个特定状态相关的行为
 * @author wzc
 * @date 2018/9/19
 */
public abstract class State {
    public abstract void handle(Context context);
}
