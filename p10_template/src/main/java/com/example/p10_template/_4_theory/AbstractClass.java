package com.example.p10_template._4_theory;

/**
 * @author wangzhichao
 * @date 2019/10/25
 */
public abstract class AbstractClass {

    public void templateMethod() {
        primitiveOperation1();
        primitiveOperation2();
    }

    public abstract void primitiveOperation1();
    public abstract void primitiveOperation2();
}
