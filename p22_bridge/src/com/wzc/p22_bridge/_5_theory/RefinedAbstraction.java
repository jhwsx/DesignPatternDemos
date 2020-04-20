package com.wzc.p22_bridge._5_theory;

/**
 * 扩充抽象类
 * <p>
 * 扩充由Abstraction定义的接口，通常情况下它不再是抽象类而是具体类，它实现了在Abstraction中声明的抽象业务方法，
 * 在RefinedAbstraction中可以调用在Implementor中定义的业务方法。
 *
 * @author wangzhichao
 * @since 2019/12/07
 */
public class RefinedAbstraction extends Abstraction {
    @Override
    public void operation() {
        implementor.operation();
    }
}
