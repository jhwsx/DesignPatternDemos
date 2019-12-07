package com.wzc.p22_bridge._5_theory;

/**
 * 具体实现类 A
 *
 * 具体实现Implementor接口，在不同的ConcreteImplementor中提供基本操作的不同实现，
 * 在程序运行时，ConcreteImplementor对象将替换其父类对象，提供给抽象类具体的业务操作方法。
 * @author wangzhichao
 * @since 2019/12/07
 */
public class ConcreteImplementorA extends Implementor {
    @Override
    public void operation() {
        System.out.println("具体实现 A 的方法执行");
    }
}
