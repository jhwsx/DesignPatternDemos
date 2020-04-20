package com.example.p9_prototype._2_theory;

/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class ConcretePrototype1 extends Prototype {
    public ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public ConcretePrototype1 clone() throws CloneNotSupportedException {
        return (ConcretePrototype1) super.clone();
    }
}
