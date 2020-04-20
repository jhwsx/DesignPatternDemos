package com.wzc.p26_flyweight._5_composite_flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元对象
 * <p>
 * 是由单纯享元对象通过复合而成的。
 * 它提供了add()这样的聚集管理方法。由于一个复合享元对象具有不同的聚集元素，
 * 这些聚集元素在复合享元对象被创建之后加入，这本身就意味着复合享元对象的状态是会改变的，因此复合享元对象是不能共享的。
 * <p>
 * 复合享元角色实现了抽象享元角色所规定的接口，也就是operation()方法，这个方法有一个参数，代表复合享元对象的外蕴状态。
 * 一个复合享元对象的所有单纯享元对象元素的外蕴状态都是与复合享元对象的外蕴状态相等的；而一个复合享元对象所含有的单纯享
 * 元对象的内蕴状态一般是不相等的，不然就没有使用价值了。
 *
 * @author wangzhichao
 * @since 2019/12/13
 */
public class ConcreteCompositeFlyweight extends Flyweight {
    private Map<Integer, Flyweight> map = new HashMap<>();

    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(Integer key, Flyweight flyweight) {
        map.put(key, flyweight);
    }

    @Override
    public void operation(String extrinsicState) {
        for (Map.Entry<Integer, Flyweight> entry : map.entrySet()) {
            Flyweight flyweight = entry.getValue();
            flyweight.operation(extrinsicState);
        }
    }
}
