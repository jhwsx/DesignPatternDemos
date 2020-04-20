package com.wzc.p20_iterator._1_theory;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚集对象
 *
 * @author wangzhichao
 * @date 2019/12/04
 */
public class ConcreteAggregate<T> extends Aggregate<T> {
    // 声明一个泛型变量 items，用于存放聚合对象。
    private List<T> items = new ArrayList<>();

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(this);
    }

    // 返回聚合对象的个数
    public int count() {
        return items.size();
    }

    public void add(T value) {
        items.add(value);
    }

    public T get(int index) {
        return items.get(index);
    }
}
