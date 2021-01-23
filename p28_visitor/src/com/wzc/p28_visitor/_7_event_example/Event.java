package com.wzc.p28_visitor._7_event_example;

/**
 * @author wangzhichao
 * @since 2021/1/23
 */
public abstract class Event {

    public String name;

    public Event(String name) {
        this.name = name;
    }

    public abstract void accept(Animal animal);
}
