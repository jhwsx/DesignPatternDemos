package com.wzc.p20_iterator._1_theory;

/**
 * 具体迭代器类
 *
 * @author wangzhichao
 * @date 2019/12/04
 */
public class ConcreteIterator<T> extends Iterator<T> {

    private ConcreteAggregate<T> aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate<T> aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public T first() {
        return aggregate.get(0);
    }

    @Override
    public T next() {
        T result = null;
        current++;
        if (current < aggregate.count()) {
            result = aggregate.get(current);
        }
        return result;
    }

    @Override
    public boolean isDone() {
        return current >= aggregate.count();
    }

    @Override
    public T currentItem() {
        return aggregate.get(current);
    }
}
