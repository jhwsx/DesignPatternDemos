package com.example.p6_decorator.theoryexample;

/**
 * @author wzc
 * @date 2018/10/20
 */
public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        addedBehavior();
        System.out.println("具体装饰对象 B 的操作");
    }

    private void addedBehavior() {

    }
}
