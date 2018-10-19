package com.example.p6_decorator.theoryexample;

/**
 * 装饰抽象类, 继承 Component, 从外类来扩展 Component 类的功能,
 * 但对于 Component 来说, 是无需知道 Decorator 的存在的.
 *
 * @author wzc
 * @date 2018/10/20
 */
public abstract class Decorator extends Component {

    protected Component mComponent;

    /**
     * 设置 Component
     * @param component
     */
    public void setComponent(Component component) {
        mComponent = component;
    }

    /**
     * 重写 operation() 方法, 实际执行的是 Component 的 operation() 方法
     */
    @Override
    public void operation() {
        if (mComponent != null) {
            mComponent.operation();
        }
    }
}
