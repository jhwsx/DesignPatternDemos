package com.example.p6_decorator.theoryexample;

/**
 * @author wzc
 * @date 2018/10/20
 */
public class ConcreteDecoratorA extends Decorator {
    private String mAddedState;

    @Override
    public void operation() {
        // 首先运行原 Component 的 operation() 方法
        super.operation();
        // 再执行本类的功能, 相当于对原 Component 进行了装饰
        mAddedState = "New State";
        System.out.println("具体装饰对象 A 的操作");
    }
}
