package com.example.p9_prototype._2_theory;

/**
 * @author wangzhichao
 * @date 2019/10/24
 */
public abstract class Prototype implements Cloneable {
    private String id;

    public Prototype(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // 这里本来要写一个 clone 方法的，但是在 Java 中，所有的类都会继承 Object 类
    // 而在 Object 类中存在一个 clone 方法：
    /*protected Object clone() throws CloneNotSupportedException {
        if (!(this instanceof Cloneable)) {
            throw new CloneNotSupportedException("Class " + getClass().getName() +
                    " doesn't implement Cloneable");
        }

        return internalClone();
    }*/
    // 可以看到要调用这个方法，必须实现 Cloneable 接口，否则会抛出异常。
}
