package com.wzc.p16_state._3_theory;

/**
 * @author wzc
 * @date 2018/9/19
 */
public class Test {
    public static void main(String[] args) {
        // 构造 Context, 并设置它的初始状态为 ConcreteStateA
        Context context = new Context(new ConcreteStateA());
        // 不断地请求,同时更改状态
        context.request();
        context.request();
        context.request();
        context.request();
    }
}
