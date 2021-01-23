package com.wzc.p28_visitor._7_event_example;

/**
 * @author wangzhichao
 * @since 2021/1/23
 */
public class EagleNestStormingEvent extends Event {
    public EagleNestStormingEvent() {
        super("2021 鹰酱老窝冲击事件");
    }

    @Override
    public void accept(Animal animal) {
        animal.commentUSCapitolStormingEvent(this);
    }
}
