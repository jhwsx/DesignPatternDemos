package com.wzc.p22_bridge._5_theory;

/**
 * 抽象类的接口
 * <p>
 * 它一般是抽象类而不是接口，其中定义了一个Implementor（实现类接口）类型的对象并可以维护该对象，
 * 它与Implementor之间具有关联关系，它既可以包含抽象业务方法，也可以包含具体业务方法。
 *
 * @author wangzhichao
 * @since 2019/12/07
 */
public abstract class Abstraction {

    protected Implementor implementor;

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

    public abstract void operation();
}
