package com.wzc.p16_state._3_theory;

/**
 * @author wzc
 * @date 2018/9/19
 */
public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        // 设置 ConcreteStateB 的下一状态是 ConcreteStateA
        context.setState(new ConcreteStateA());
    }
}
