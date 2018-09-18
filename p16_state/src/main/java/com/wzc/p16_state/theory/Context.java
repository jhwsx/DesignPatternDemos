package com.wzc.p16_state.theory;

/**
 * 维护一个ConcreteState子类的实例,这个实例定义了当前的状态.
 *
 * @author wzc
 * @date 2018/9/19
 */
public class Context {
    private State state;
    // 定义Context的初始状态
    public Context(State state) {
        this.state = state;
    }
    // 读取当前状态
    public State getState() {
        return state;
    }
    // 设置新状态
    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态:" + state.getClass().getSimpleName());
    }

    public void request() {
        // 对请求做处理,并设置下一状态.
        state.handle(this);
    }
}
