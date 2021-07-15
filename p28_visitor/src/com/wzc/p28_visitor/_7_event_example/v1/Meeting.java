package com.wzc.p28_visitor._7_event_example.v1;

/**
 * 动物联合国大会
 *
 * @author wangzhichao
 * @since 2021/1/31
 */
public class Meeting {
    public static void main(String[] args) {
        System.out.println("现在我们有请种花家代表兔子发言：");
        Hare hare = new Hare();
        hare.comment(EventConstants.COVID19_EVENT);
        hare.comment(EventConstants.EAGLE_NEST_STORMING_EVENT);
        System.out.println("鹰酱，该你了：");
        Eagle eagle = new Eagle();
        eagle.comment(EventConstants.COVID19_EVENT);
        eagle.comment(EventConstants.EAGLE_NEST_STORMING_EVENT);
    }
}
