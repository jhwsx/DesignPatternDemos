package com.wzc.p26_flyweight._5_composite_flyweight;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 复合享元工厂
 *
 * @author wangzhichao
 * @since 2019/12/13
 */
public class FlyweightFactory {
    private Map<Integer, Flyweight> map = new LinkedHashMap<>();

    public Flyweight factory(List<Integer> compositeState) {
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();
        for (Integer intrinsicState : compositeState) {
            concreteCompositeFlyweight.add(intrinsicState, factory(intrinsicState));
        }
        return concreteCompositeFlyweight;
    }

    public Flyweight factory(Integer intrinsicState) {
        if (!map.containsKey(intrinsicState)) {
            map.put(intrinsicState, new ConcreteFlyweight(intrinsicState));
        }
        return map.get(intrinsicState);
    }
}
