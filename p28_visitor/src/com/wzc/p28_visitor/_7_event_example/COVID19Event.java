package com.wzc.p28_visitor._7_event_example;

/**
 * @author wangzhichao
 * @since 2021/1/23
 */
public class COVID19Event extends Event {
    public COVID19Event() {
        super("2019 新冠肺炎");
    }

    @Override
    public void accept(Animal animal) {
        animal.commentCOVIDEvent(this);
    }
}
