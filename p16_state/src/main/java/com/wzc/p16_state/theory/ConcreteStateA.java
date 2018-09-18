package com.wzc.p16_state.theory;

/**
 * 具体状态,每一个子类实现一个与Context的一个状态相关的行为
 * @author wzc
 * @date 2018/9/19
 */
public class ConcreteStateA extends State {
    @Override
    public void handle(Context context) {
        // 设置 ConcreteStateA 的下一状态是 ConcreteStateB
        context.setState(new ConcreteStateB());
    }
}
