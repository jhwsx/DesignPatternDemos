package com.wzc.p19_composite._1_theory;

/**
 * Component 为组合中的对象声明接口，在适当情况下，实现所有类共有接口的默认行为。
 * 声明一个接口用于访问和管理 Component 的子部件。
 *
 * @author wangzhichao
 * @date 2019/12/03
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component c);

    public abstract void remove(Component c);

    public abstract void display(int depth);
}
