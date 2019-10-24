package com.example.p9_prototype._2_theory;

/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        ConcretePrototype1 c1 = p1.clone();
        System.out.println("p1.getId() = " + p1.getId() + ", p1 = " + p1);
        System.out.println("c1.getId() = " + c1.getId() + ", c1 = " + c1);
    }
}
